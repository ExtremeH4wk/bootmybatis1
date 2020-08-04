package com.example.bootmybatis.dao;


import com.example.bootmybatis.entity.cheapShopping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

@Mapper
public interface cheapDao {
    List<cheapShopping> getALLCheap();
}
