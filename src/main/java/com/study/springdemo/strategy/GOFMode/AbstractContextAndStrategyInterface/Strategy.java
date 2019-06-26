package com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface;

import org.springframework.stereotype.Component;

/**
 * 策略接口
 *
 * @author 小呆呆
 * @create 2019-06-26 13:16
 *
 **/
public interface Strategy {
    // 在这里面可以定义  任意的策略 如：  （武器在变换） 不同的角色 使用不同的武器
//    public String type();
    public void useWeaPon();
}
