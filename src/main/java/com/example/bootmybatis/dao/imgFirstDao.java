package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.imgFirst;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

@Mapper
public interface imgFirstDao {
//    @Select("        SELECT\n" +
//            "        id,\n" +
//            "        pic_data as img\n" +
//            "        FROM imgfirst")
    List<imgFirst> getAllImgFirst();
}
