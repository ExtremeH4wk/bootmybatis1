package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.ImgHome;
import com.example.bootmybatis.server.ImgHomeService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "ImgHomeController",description = "这是关于第一个首页轮播图的接口")
@Controller
@RequestMapping("/imgHome")

public class ImgHomeController {
    @Autowired
    ImgHomeService service;
    @ApiOperation(value="这是获取第一个首页轮播图的信息",notes="第一个首页轮播图信息")
    @RequestMapping(value="/getFirst", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllFirst(){
        List<ImgHome> getAllImgFirst=service.getAllFirst();
        return ResultMap.success(getAllImgFirst);
    }
    @ApiOperation(value="这是获取第二个首页轮播图",notes="第二个首页轮播图")
    @RequestMapping(value="/getSecond", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllSecond(){
        List<ImgHome>getAllImgSecond=service.getAllSecond();
        return ResultMap.success(getAllImgSecond);
    }
    @ApiOperation(value="这是获取第三个首页轮播图",notes="第三个首页轮播图")
    @RequestMapping(value="/getThird", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllThird(){
        List<ImgHome>getAllImgThird=service.getAllThird();
        return ResultMap.success(getAllImgThird);
    }
}