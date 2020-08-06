package com.example.bootmybatis.entity;

public class ImgThird {
    private int id;
    private String img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ImgThird{" +
                "id=" + id +
                ", img='" + img + '\'' +
                '}';
    }
}
