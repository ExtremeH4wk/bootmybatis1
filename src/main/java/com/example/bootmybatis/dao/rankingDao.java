package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.rankingShopping;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface rankingDao {
    List<rankingShopping> getALLRanking();
}
