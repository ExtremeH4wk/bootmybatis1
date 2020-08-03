package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.imgSecond;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

@Mapper
public interface imgSecondDao {
//    @Select("        SELECT\n" +
//            "        id,\n" +
//            "        pic_data as img\n" +
//            "        FROM imgsecond")
    List<imgSecond> getAllImgSecond();
}
