package com.example.bootmybatis.controller;


import com.example.bootmybatis.entity.Type;

import com.example.bootmybatis.server.TypeService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Api(value = "typeController",description = "这是关于商品分类的接口")
@Controller
@RequestMapping("/type")

public class TypeController {
    @Autowired
    TypeService service;
    @ApiOperation(value="这是获取商品分类名",notes="商品分类名")
    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<Type>getAllType=service.getAllType();
        return ResultMap.success(getAllType);
    }

}
