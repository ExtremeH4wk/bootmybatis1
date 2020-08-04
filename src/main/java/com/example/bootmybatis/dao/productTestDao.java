package com.example.bootmybatis.dao;
import com.example.bootmybatis.entity.productTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface productTestDao {
//    @Select("        select\n" +
//            "        p_id as id,\n" +
//            "        p_name as title,\n" +
//            "        pic_data as img,\n" +
//            "        p_text as text,\n" +
//            "        p_typeId as classid,\n" +
//            "        price as price,\n" +
//            "        pic_data1 as img1,\n" +
//            "        pic_data2 as img2,\n" +
//            "        pic_data3 as img3,\n" +
//            "        deBut as text2\n" +
//            "        from product")
    List<productTest> getAll();
    productTest getById(int productId);
}


