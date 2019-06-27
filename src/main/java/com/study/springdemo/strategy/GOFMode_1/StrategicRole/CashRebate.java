package com.study.springdemo.strategy.GOFMode_1.StrategicRole;

import com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext.Strategy;
import org.springframework.stereotype.Service;

/**
 * 打折收费类
 *
 * @author 小呆呆
 * @create 2019-06-27 14:45
 **/
@Service
public class CashRebate implements Strategy {

//    private double moneyRebate = 1;
//    public CashRebate(double moneyRebate){
//        this.moneyRebate = moneyRebate;  // 当折扣为0.8时， 传入0.8
//    }

    @Override
    public String type() {
        return "rebate";
    }

    @Override
    public double acceptCash(double money) {
        // 操作数据 查询满减多少的业务逻辑
        double moneyRebate = 0.8;
        return moneyRebate * money;
    }
}
