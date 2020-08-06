package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.ImgSecondDao;

import com.example.bootmybatis.entity.ImgSecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImgSecondService {
    @Autowired(required = false)
    ImgSecondDao imgSecondDao;
    public List<ImgSecond> getAllImgSecond(){
        return imgSecondDao.getAllImgSecond();
    }
}
