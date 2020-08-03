package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.imgThird;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

@Mapper
public interface imgThirdDao {
//    @Select("        SELECT\n" +
//            "        id,\n" +
//            "        pic_data as img\n" +
//            "        FROM imgthird")
    List<imgThird> getAllImgThird();
}
