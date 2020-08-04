package com.example.bootmybatis.dao;


import com.example.bootmybatis.entity.product;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface productDao {

    List<product> getAll();
    product getById(int productId);
}


