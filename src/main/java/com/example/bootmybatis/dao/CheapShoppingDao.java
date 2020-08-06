package com.example.bootmybatis.dao;


import com.example.bootmybatis.entity.CheapShopping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheapShoppingDao {
    List<CheapShopping> getAllCheap();
}
