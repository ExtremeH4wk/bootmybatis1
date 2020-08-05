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
    //添加商品
    void addProduct(productTest product);
    //更新商品内容
    // 更新一个内容我们的 数据是一个完整更新, 我们就需要一个完整对象才可以进行解析
    void updateProduct(productTest product);
    //删除商品, 默认返回值是int
    // Affected rows: 1 我们用sql语句去删除数据库中的内容的时候, 实际上会返回 受影响的行数
    // 返回值可以写 void  可以写int  只要是增删改操作, 你的返回值都可选
    void deleteProduct(int productId);
}


