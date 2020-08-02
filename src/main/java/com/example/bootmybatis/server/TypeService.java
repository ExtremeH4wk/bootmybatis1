package com.example.bootmybatis.server;


import com.example.bootmybatis.dao.typeDao;

import com.example.bootmybatis.entity.type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired(required = false)
    typeDao typeDao;
    public List<type> getAllType(){
        return typeDao.getAllType();
    }
}
