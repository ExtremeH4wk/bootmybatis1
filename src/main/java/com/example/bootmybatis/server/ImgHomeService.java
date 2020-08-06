package com.example.bootmybatis.server;

import com.example.bootmybatis.dao.ImgHomeDao;
import com.example.bootmybatis.entity.ImgHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgHomeService {
    @Autowired(required = false)
    ImgHomeDao imgHomeDao;
    public List<ImgHome> getAllFirst(){
        return imgHomeDao.getAllImgFirst();
    }
    public List<ImgHome> getAllSecond(){
        return imgHomeDao.getAllImgSecond();
    }
    public List<ImgHome> getAllThird(){
        return imgHomeDao.getAllImgThird();
    }
}