package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.ImgThird;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface ImgThirdDao {
    List<ImgThird> getAllImgThird();
}
