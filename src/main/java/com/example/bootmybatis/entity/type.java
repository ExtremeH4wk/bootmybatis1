package com.example.bootmybatis.entity;

public class type {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "type{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
