package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.cheapDetails;
import com.example.bootmybatis.server.cheapDetailsService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "cheapDetailsController",description = "这是关于特价商品详情的接口")
@Controller
@RequestMapping("/cheapDetails")

public class cheapDetailsController {
    @Autowired
    cheapDetailsService service;

    @RequestMapping(value="/getALL", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getALLDetails(){

        List<cheapDetails> getALLCheapDetails=service.getALLcheapDetails();

        return ResultMap.success(getALLCheapDetails);
    }
}
