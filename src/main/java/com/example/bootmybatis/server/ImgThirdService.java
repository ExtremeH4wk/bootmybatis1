package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.ImgThirdDao;
import com.example.bootmybatis.entity.ImgThird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImgThirdService {
    @Autowired(required = false)
    ImgThirdDao imgThirdDao;
    public List<ImgThird> getAllImgThird(){
        return imgThirdDao.getAllImgThird();
    }
}
