package com.example.bootmybatis.controller;


import com.example.bootmybatis.entity.type;

import com.example.bootmybatis.server.TypeService;
import io.swagger.annotations.Api;
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
//    @ApiOperation(value="这是获取所有用户",notes="用户信息")
//    @ApiImplicitParam(name = "username",value = "用户名",dataType = "String")

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public List<type> getAll(){

        return service.getAllType();
    }

}
