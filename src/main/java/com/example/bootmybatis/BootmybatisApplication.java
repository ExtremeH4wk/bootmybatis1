package com.example.bootmybatis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
//http://127.0.0.1:8888/swagger-ui.html#/
@SpringBootApplication
@EnableAsync
public class BootmybatisApplication {
    public static void main(String[] args) {

        SpringApplication.run(BootmybatisApplication.class, args);
    }

}
