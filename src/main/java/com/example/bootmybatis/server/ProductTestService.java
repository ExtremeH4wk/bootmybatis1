package com.example.bootmybatis.server;



import com.example.bootmybatis.dao.productTestDao;

import com.example.bootmybatis.entity.productTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTestService {
    @Autowired(required = false)
    productTestDao productTestDao;

    public List<productTest> getAllProductTest(){

        return productTestDao.getAll();
    }
    //查询某个商品 (一条记录)->一个实体类
    public productTest getById(int productId) {
        return productTestDao.getById(productId);
    }
}