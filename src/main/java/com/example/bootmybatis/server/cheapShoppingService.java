package com.example.bootmybatis.server;

import com.example.bootmybatis.dao.cheapDao;

import com.example.bootmybatis.entity.cheapShopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cheapShoppingService {
    @Autowired(required = false)
    cheapDao cheapDao;

    public List<cheapShopping> getALLcheapShopping(){
        return cheapDao.getALLCheap();
    }

}
