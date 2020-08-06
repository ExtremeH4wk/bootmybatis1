package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.Product;
import com.example.bootmybatis.server.ProductService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Api(value = "ProductController",description = "这是关于商品的接口")
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService service;
    @ApiOperation(value="这是获取所有商品",notes="商品信息")
    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllProduct(){
        List<Product>getAllProduct=service.getAllProduct();
        return ResultMap.success(getAllProduct);
    }
    @ApiOperation(value="这是获取指定商品",notes="商品id所对应的信息")
    @GetMapping(value="/get/{productId}")
    @ResponseBody
    public ResultMap getByProductId(@PathVariable Integer productId) {
        return ResultMap.success(service.getById(productId));
    }
}
