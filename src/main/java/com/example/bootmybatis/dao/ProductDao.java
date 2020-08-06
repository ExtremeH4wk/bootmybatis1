package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface ProductDao {
    List<Product> getAll();
    Product getById(int productId);
}


