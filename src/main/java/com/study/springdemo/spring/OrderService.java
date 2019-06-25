package com.study.springdemo.spring;

/**
 *  订单操作、业务伪代码
 */
public class OrderService {
    /**
     *  新订单
     */
    public void saveOrder(){
        // 伪代码的意思：忽略很多逻辑，参数封装、数据查询等等逻辑
        // 1---创建订单---
        System.out.println("1、创建订单成功");
        // 2---短信通知
        System.out.println("2、调用短信发送接口--> 恭喜喜提羽绒被子");
    }
}
