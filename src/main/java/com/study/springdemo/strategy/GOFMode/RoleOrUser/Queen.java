package com.study.springdemo.strategy.GOFMode.RoleOrUser;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Context;
import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import com.study.springdemo.strategy.GOFMode.Features.KnifeBehavior;
import org.springframework.stereotype.Service;

/**
 * 皇后
 *
 * @author 小呆呆
 * @create 2019-06-26 14:09
 **/
@Service
public class Queen extends Context {

    Strategy strategy;
    public Queen(){
        strategy = new KnifeBehavior();
    }

    @Override
    protected void display() {
        System.out.println("我是皇后");
    }
}
