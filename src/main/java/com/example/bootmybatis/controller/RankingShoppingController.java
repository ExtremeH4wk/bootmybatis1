package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.RankingShopping;
import com.example.bootmybatis.server.RankingShoppingService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(value = "RankingShoppingController",description = "这是关于排行榜的接口")
@Controller
@RequestMapping("/rankingShopping")

public class RankingShoppingController {
    @Autowired
    RankingShoppingService service;
    @ApiOperation(value="这是获取排行榜中的所有商品信息",notes="销量前十的商品信息")
    @RequestMapping(value="/getALL", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllRanking(){
        List<RankingShopping>getAllRankingShopping=service.getAllRankingShopping();
        return ResultMap.success(getAllRankingShopping);
    }
}
