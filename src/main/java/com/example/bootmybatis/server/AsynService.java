package com.example.bootmybatis.server;

import org.springframework.stereotype.Service;

@Service
public class AsynService {
    public void task(){
        try{
            Thread.currentThread().sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("某个数据正在处理");
    }
}
