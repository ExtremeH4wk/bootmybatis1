package com.example.bootmybatis.server;


import com.example.bootmybatis.dao.productDao;
import com.example.bootmybatis.dao.typeDao;
import com.example.bootmybatis.entity.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired(required = false)
    productDao productDao;
    public List<product> getAllProduct(){

        return productDao.getAllProduct();
    }
}
