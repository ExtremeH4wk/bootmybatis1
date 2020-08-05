//package com.example.bootmybatis.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping("/rest")
//public class Restfulcontorller {
//    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public String get(@PathVariable Integer id){
//        return "获取到的用户id为:"+id;
//    }
//    @RequestMapping("/delete/{id}")
//    @ResponseBody
//    public String delete(@PathVariable Integer id){
//        return "获取到要删除的用户为:"+id;
//    }
//    @RequestMapping(value = "/add/{id}",method = RequestMethod.POST)
//    @ResponseBody
//    public String add(@PathVariable Integer id){
//
//        return "新增到的用户id为:"+id;
//    }
//    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
//    @ResponseBody
//    public String upDate(@PathVariable Integer id){
//        return "更新到的用户id为:"+id;
//    }
//}
