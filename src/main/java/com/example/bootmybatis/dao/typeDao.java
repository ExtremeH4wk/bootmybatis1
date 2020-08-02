package com.example.bootmybatis.dao;

import com.example.bootmybatis.entity.type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface typeDao {
//    @Select("        select\n" +
//            "        typeId as id,\n" +
//            "        typeName as title,\n" +
//            "        from type")
    List<type> getAllType();
}
