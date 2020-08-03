package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.imgThirdDao;
import com.example.bootmybatis.entity.imgThird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class imgThirdService {
    @Autowired(required = false)
    imgThirdDao imgThirdDao;
    public List<imgThird> getAllImgThird(){
        return imgThirdDao.getAllImgThird();
    }
}
