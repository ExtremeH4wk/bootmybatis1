package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.imgSecondDao;

import com.example.bootmybatis.entity.imgSecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class imgSecondService {
    @Autowired(required = false)
    imgSecondDao imgSecondDao;
    public List<imgSecond> getAllImgSecond(){
        return imgSecondDao.getAllImgSecond();
    }
}
