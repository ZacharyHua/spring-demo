package com.study.springdemo.strategy.GOFMode.RoleOrUser;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Context;
import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import com.study.springdemo.strategy.GOFMode.Features.SwordBehavior;

/**
 * 骑士
 *
 * @author 小呆呆
 * @create 2019-06-26 14:10
 **/
public class Knight extends Context {
    Strategy strategy;
    public Knight(){
        strategy = new SwordBehavior();
    }

    @Override
    protected void display() {
        System.out.println("我是骑士");
    }

}
