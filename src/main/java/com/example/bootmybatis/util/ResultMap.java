package com.example.bootmybatis.util;
//接口格式封装
public class ResultMap {
    // 在企业中前台所需要的信息 通常 常见的有这么几个
    private Integer code; //状态码  成功0,200  失败 400 500..
    private String msg; //携带信息, 参考信息
    // 获取到数据
    private Object data; // Object可以容纳任意类型,就可以把前台所需要的数据进行一个返回

    // 这个封装其实还可以继续优化
    public ResultMap(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMap() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    // 一个示例
    public static ResultMap success(Object data) {

        return new ResultMap(200, "success", data);
    }
}

