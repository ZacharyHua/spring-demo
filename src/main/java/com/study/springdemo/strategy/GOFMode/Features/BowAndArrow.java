package com.study.springdemo.strategy.GOFMode.Features;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import org.springframework.stereotype.Service;

/**
 * 骑士
 *
 * @author 小呆呆
 * @create 2019-06-26 13:26
 **/
@Service
public class BowAndArrow implements Strategy {
//    @Override
//    public String type() {
//        return "bow";
//    }

    @Override
    public void useWeaPon() {
        System.out.println("我是弓箭手...");
    }
}
