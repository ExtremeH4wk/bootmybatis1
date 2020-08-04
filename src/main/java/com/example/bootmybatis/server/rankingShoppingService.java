package com.example.bootmybatis.server;

import com.example.bootmybatis.dao.rankingDao;
import com.example.bootmybatis.entity.rankingShopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rankingShoppingService {
    @Autowired(required = false)
    rankingDao rankingDao;

    public List<rankingShopping> getALLrankingShopping(){
        return rankingDao.getALLRanking();
    }

}
