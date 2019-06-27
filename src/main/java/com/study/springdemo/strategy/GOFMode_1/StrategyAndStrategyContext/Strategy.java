package com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext;

/**
 * 定义抽象策略角色（Strategy）：现金收费抽象类
 *
 * @author 小呆呆
 * @create 2019-06-27 14:41
 **/
public interface Strategy {
    String type();
    double acceptCash(double money);
}
