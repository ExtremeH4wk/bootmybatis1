package com.example.bootmybatis.controller;

import com.example.bootmybatis.server.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {
    @Autowired
    AsynService service;
    @RequestMapping("/task")
    @ResponseBody
    public String hello(){
        service.task();
        return "ok";
    }
}
