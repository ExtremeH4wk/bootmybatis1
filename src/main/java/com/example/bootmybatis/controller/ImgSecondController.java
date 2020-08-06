package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.ImgSecond;
import com.example.bootmybatis.server.ImgSecondService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Api(value = "ImgSecondController",description = "这是关于第二个首页轮播图的接口")
@Controller
@RequestMapping("/imgSecond")

public class ImgSecondController {
    @Autowired
    ImgSecondService service;
    @ApiOperation(value="这是获取第二个首页轮播图",notes="第二个首页轮播图")
    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<ImgSecond>getAllImgSecond=service.getAllImgSecond();
        return ResultMap.success(getAllImgSecond);
    }

}
