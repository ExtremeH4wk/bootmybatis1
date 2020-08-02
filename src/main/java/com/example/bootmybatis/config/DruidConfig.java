package com.example.bootmybatis.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 想要成为配置类, 第一步是要先有注解
 * @Configuration 有这个注解才代表当前的这个java类是我们springBoot中的配置类
 */
@Configuration
public class DruidConfig {


    // 绑定属性
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean  // 让这个对象成为Boot配置的一部分@Controller
    public DataSource druid() {
        // 返回Druid的数据库连接池
        // 实际上我们绑定的属性就会被绑定到对应DruidDataSource这个对象中
        // 看源码 按住ctrl+鼠标左键
        return new DruidDataSource();
    }

    // 配置管理后台的servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        // 配置该servlet负责所有的druid的请求
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        // 那么这个bean就是负责监听的bean, 我们可以配置一些相关的属性
        // 比如用户名或者密码 或者初始化大小等等
        // 这些参数以Map方式存储, 具体的参数名可以查看ResourceServlet源码参数
        Map<String, String> init = new HashMap<>();
        init.put("loginUsername", "admin");
        init.put("loginPassword", "123456");
        //allow 允许谁访问  // 允许任何人, 在公司中就写对应主机的ip地址
        init.put("allow", "");// 允许访问
        // 也可以配置拒绝访问的ip (deny)
        bean.setInitParameters(init);
        return bean;
    }

    // web监控的filter过滤器
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean =new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}
