package com.example.bootmybatis.controller;


import com.example.bootmybatis.entity.product;
import com.example.bootmybatis.server.ProductService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Api(value = "productController",description = "这是关于商品的接口")
@Controller
@RequestMapping("/product")

public class ProductController {
    @Autowired
    ProductService service;
//    @ApiOperation(value="这是获取所有用户",notes="用户信息")
//    @ApiImplicitParam(name = "username",value = "用户名",dataType = "String")

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<product>getAllProduct=service.getAllProduct();
        return ResultMap.success(getAllProduct);
    }

}
