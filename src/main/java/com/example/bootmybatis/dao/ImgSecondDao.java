package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.ImgSecond;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

@Mapper
public interface ImgSecondDao {
//    @Select("        SELECT\n" +
//            "        id,\n" +
//            "        pic_data as img\n" +
//            "        FROM imgsecond")
    List<ImgSecond> getAllImgSecond();
}
