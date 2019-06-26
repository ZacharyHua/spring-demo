package com.study.springdemo.strategy.GOFMode.RoleOrUser;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Context;
import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import com.study.springdemo.strategy.GOFMode.Features.SwordBehavior;
import org.springframework.stereotype.Service;

/**
 * 妖怪
 *
 * @author 小呆呆
 * @create 2019-06-26 14:11
 **/
@Service
public class Troll extends Context {
    Strategy strategy;

    public Troll(){
        strategy = new SwordBehavior();
    }

    @Override
    protected void display() {
        System.out.println("我是妖怪");
    }
}
