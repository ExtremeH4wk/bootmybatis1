package com.example.bootmybatis.controller;


import com.example.bootmybatis.entity.ImgThird;
import com.example.bootmybatis.server.ImgThirdService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "ImgThirdController",description = "这是关于第三个首页轮播图的接口")
@Controller
@RequestMapping("/imgThird")

public class ImgThirdController {
    @Autowired
    ImgThirdService service;
    @ApiOperation(value="这是获取第三个首页轮播图",notes="第三个首页轮播图")

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<ImgThird>getAllImgThird=service.getAllImgThird();
        return ResultMap.success(getAllImgThird);
    }

}
