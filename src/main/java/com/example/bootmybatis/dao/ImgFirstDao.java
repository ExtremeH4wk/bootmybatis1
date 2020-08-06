package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.ImgFirst;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface ImgFirstDao {
    List<ImgFirst> getAllImgFirst();
}
