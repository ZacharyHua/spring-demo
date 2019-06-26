package com.study.springdemo.strategy.GOFMode.Features;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import org.springframework.stereotype.Service;

/**
 * 剑士
 *
 * @author 小呆呆
 * @create 2019-06-26 13:29
 **/
@Service
public class SwordBehavior implements Strategy {
//    @Override
//    public String type() {
//        return "sword";
//    }

    @Override
    public void useWeaPon() {
        System.out.println("我是剑士...");
    }
}
