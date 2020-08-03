package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.imgFirstDao;
import com.example.bootmybatis.entity.imgFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class imgFirstService {
    @Autowired(required = false)
    imgFirstDao imgFirstDao;
    public List<imgFirst> getAllImgFirst(){

        return imgFirstDao.getAllImgFirst();
    }
}
