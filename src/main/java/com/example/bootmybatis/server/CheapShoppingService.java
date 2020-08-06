package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.CheapShoppingDao;
import com.example.bootmybatis.entity.CheapShopping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CheapShoppingService {
    @Autowired(required = false)
    CheapShoppingDao cheapShoppingDao;
    public List<CheapShopping> getAllCheapShopping(){
        return cheapShoppingDao.getAllCheap();
    }
}
