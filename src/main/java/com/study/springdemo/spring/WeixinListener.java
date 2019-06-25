package com.study.springdemo.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WeixinListener implements SmartApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到订单事件， 执行发送##微信#的操作");
    }

    @Override
    public int getOrder() {
        return 59;
    }

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == OrderEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return false;
    }




}
