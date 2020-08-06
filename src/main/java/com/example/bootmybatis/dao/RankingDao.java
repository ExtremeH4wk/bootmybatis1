package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.RankingShopping;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface RankingDao {
    List<RankingShopping> getAllRanking();
}
