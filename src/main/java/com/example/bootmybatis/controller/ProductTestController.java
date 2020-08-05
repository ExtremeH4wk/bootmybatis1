package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.productTest;
import com.example.bootmybatis.server.ProductTestService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "productController",description = "这是关于商品的接口")
@Controller
@RequestMapping("/productTest")

public class ProductTestController {
    @Autowired
    ProductTestService service;

//    @ApiOperation(value="这是获取所有用户",notes="用户信息")
//    @ApiImplicitParam(name = "username",value = "用户名",dataType = "String")

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllProductTest(){

        List<productTest>getAllProductTest=service.getAllProductTest();

        return ResultMap.success(getAllProductTest);
    }
    @GetMapping(value="/get/{productId}")
    @ResponseBody
    public ResultMap getByProductId(@PathVariable Integer productId) {
        return ResultMap.success(service.getById(productId));
    }
    /**
     * 大家可以使用之前的那种封装请求方式, 不用restful风格
     * restful风格可以接收的是json参数(@RequestBody),不是像之前那样的 字符串参数
     */
    @PostMapping("/insert")
    @ResponseBody
    public ResultMap insertProduct(@RequestBody productTest product) {
        service.addProduct(product);
        return ResultMap.success(null);
    }
}
