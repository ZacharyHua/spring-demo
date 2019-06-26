package com.study.springdemo.strategy.GOFMode.Features;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import org.springframework.stereotype.Service;

/**
 * 带刀侍卫
 *
 * @author 小呆呆
 * @create 2019-06-26 13:27
 **/
@Service
public class KnifeBehavior implements Strategy {
//    @Override
//    public String type() {
//        return "knife";
//    }

    @Override
    public void useWeaPon() {
        System.out.println("我是带刀侍卫...");
    }
}
