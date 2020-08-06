package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.ImgFirst;
import com.example.bootmybatis.server.ImgFirstService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Api(value = "ImgFirstController",description = "这是关于第一个首页轮播图的接口")
@Controller
@RequestMapping("/imgFirst")

public class ImgFirstController {
    @Autowired
    ImgFirstService service;
    @ApiOperation(value="这是获取第一个首页轮播图的信息",notes="第一个首页轮播图信息")


    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<ImgFirst>getAllImgFirst=service.getAllImgFirst();
        return ResultMap.success(getAllImgFirst);
    }

}
