package com.example.bootmybatis.server;

import com.example.bootmybatis.dao.cheapDetailsDao;
import com.example.bootmybatis.entity.cheapDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cheapDetailsService {
    @Autowired(required = false)
    cheapDetailsDao cheapDetailsDao;

    public List<cheapDetails> getALLcheapDetails(){
        return cheapDetailsDao.getALLDetails();
    }
}
