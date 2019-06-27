package com.study.springdemo.strategy.GOFMode_1.StrategicRole;

import com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext.Strategy;
import org.springframework.stereotype.Service;

/**
 * 正常收费类
 *
 * @author 小呆呆
 * @create 2019-06-27 14:45
 **/
@Service
public class CashNormal implements Strategy {

    @Override
    public String type() {
        return "normal";
    }

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
