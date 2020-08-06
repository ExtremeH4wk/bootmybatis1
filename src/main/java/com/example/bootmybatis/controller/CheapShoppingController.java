package com.example.bootmybatis.controller;
import com.example.bootmybatis.entity.CheapShopping;
import com.example.bootmybatis.server.CheapShoppingService;
import com.example.bootmybatis.util.ResultMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Api(value = "CheapShoppingController",description = "这是关于特价商品的接口")
@Controller
@RequestMapping("/cheapshopping")
public class CheapShoppingController {
    @Autowired
    CheapShoppingService service;
    @ApiOperation(value="获取特价商品详细信息", notes="根据url的id来获取特价商品信息")
    @RequestMapping(value="/cheap", method= RequestMethod.GET)
    @ResponseBody
    public ResultMap getAllCheap(){
        List<CheapShopping>getALLCheapShopping=service.getAllCheapShopping();
        return ResultMap.success(getALLCheapShopping);
    }

}
