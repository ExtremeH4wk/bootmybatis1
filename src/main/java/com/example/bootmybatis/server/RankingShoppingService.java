package com.example.bootmybatis.server;

import com.example.bootmybatis.dao.RankingDao;
import com.example.bootmybatis.entity.RankingShopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingShoppingService {
    @Autowired(required = false)
    RankingDao rankingDao;

    public List<RankingShopping> getAllRankingShopping(){
        return rankingDao.getAllRanking();
    }

}
