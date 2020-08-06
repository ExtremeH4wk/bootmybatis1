package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface TypeDao {
    List<Type> getAllType();
}
