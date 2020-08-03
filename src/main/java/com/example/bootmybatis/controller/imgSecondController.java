package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.imgSecond;
import com.example.bootmybatis.server.imgSecondService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Api(value = "imgSecondController",description = "这是关于第二个首页轮播图的接口")
@Controller
@RequestMapping("/imgSecond")

public class imgSecondController {
    @Autowired
    imgSecondService service;
//    @ApiOperation(value="这是获取所有用户",notes="用户信息")
//    @ApiImplicitParam(name = "username",value = "用户名",dataType = "String")

    @RequestMapping(value="/getAll", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAll(){
        List<imgSecond>getAllImgSecond=service.getAllImgSecond();
        return ResultMap.success(getAllImgSecond);
    }

}
