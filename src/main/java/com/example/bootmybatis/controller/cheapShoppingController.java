package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.cheapShopping;
import com.example.bootmybatis.server.cheapShoppingService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Api(value = "cheapShoppingController",description = "这是关于特价商品的接口")
@Controller
@RequestMapping("/cheapshopping")

public class cheapShoppingController {
    @Autowired
    cheapShoppingService service;


    @RequestMapping(value="/cheap", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getALLCheap(){

        List<cheapShopping>getALLCheapShopping=service.getALLcheapShopping();

        return ResultMap.success(getALLCheapShopping);
    }

}
