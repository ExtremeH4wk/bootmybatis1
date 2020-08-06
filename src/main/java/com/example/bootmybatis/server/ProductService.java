package com.example.bootmybatis.server;
import com.example.bootmybatis.dao.ProductDao;
import com.example.bootmybatis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
    @Autowired(required = false)
    ProductDao productDao;
    //查询所有商品
    public List<Product> getAllProduct(){
        return productDao.getAll();
    }
    //查询某个商品 (一条记录)->一个实体类
    public Product getById(int productId) {
        return productDao.getById(productId);
    }

}
