package com.study.springdemo.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 *  监听订单创建事件 - 发送短信
 */
@Component
public class SmsListener implements SmartApplicationListener {
    /**
     *  当事件发生时执行
     * @param applicationEvent
     */
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到订单事件，执行发送短信操作");
    }

    /**
     *  定义多个事件的执行顺序
     * @return
     */
    @Override
    public int getOrder() {
        // 值越大，顺序越往后
        return 60;
    }

    /**
     *  监听哪一种事件
     * @param aClass
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == OrderEvent.class;
    }
    @Override
    public boolean supportsSourceType(Class<?> sourceType) {
        return true;
    }


}
