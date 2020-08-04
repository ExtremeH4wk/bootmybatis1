package com.example.bootmybatis.controller;

import com.example.bootmybatis.entity.rankingShopping;
import com.example.bootmybatis.server.rankingShoppingService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "rankingShoppingController",description = "这是关于排行榜的接口")
@Controller
@RequestMapping("/rankingShopping")

public class rankingShoppingController {
    @Autowired
    rankingShoppingService service;

    @RequestMapping(value="/getALL", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getALLRanking(){
        List<rankingShopping>getALLRankingShopping=service.getALLrankingShopping();
        return ResultMap.success(getALLRankingShopping);
    }
}
