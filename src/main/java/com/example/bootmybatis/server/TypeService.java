package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.TypeDao;
import com.example.bootmybatis.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeService {
    @Autowired(required = false)
    TypeDao typeDao;
    public List<Type> getAllType(){
        return typeDao.getAllType();
    }
}
