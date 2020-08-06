package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.ImgHome;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ImgHomeDao {
    List<ImgHome> getAllImgFirst();
    List<ImgHome> getAllImgSecond();
    List<ImgHome> getAllImgThird();
}
