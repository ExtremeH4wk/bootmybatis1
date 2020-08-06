package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.ImgFirstDao;
import com.example.bootmybatis.entity.ImgFirst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ImgFirstService {
    @Autowired(required = false)
    ImgFirstDao imgFirstDao;
    public List<ImgFirst> getAllImgFirst(){
        return imgFirstDao.getAllImgFirst();
    }
}
