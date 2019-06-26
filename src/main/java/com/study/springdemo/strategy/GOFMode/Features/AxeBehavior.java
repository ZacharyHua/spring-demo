package com.study.springdemo.strategy.GOFMode.Features;

import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import org.springframework.stereotype.Service;

/**
 * 禁卫
 *
 * @author 小呆呆
 * @create 2019-06-26 13:24
 **/
@Service
public class AxeBehavior implements Strategy {
//    @Override
//    public String type() {
//        return "king";
//    }

    @Override
    public void useWeaPon() {
        System.out.println("我是刀斧手...");
    }
}
