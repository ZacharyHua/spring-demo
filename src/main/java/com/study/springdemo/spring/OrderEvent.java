package com.study.springdemo.spring;

import org.springframework.context.ApplicationEvent;

/**
 *  创建订单事件
 */
public class OrderEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public OrderEvent(Object source) {
        super(source);
    }
}
