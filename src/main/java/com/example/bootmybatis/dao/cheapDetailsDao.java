package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.cheapDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface cheapDetailsDao {
    List<cheapDetails> getALLDetails();
}
