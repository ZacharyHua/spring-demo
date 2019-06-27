package com.study.springdemo.strategy.GOFMode_1.StrategicRole;

import com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext.Strategy;
import org.springframework.stereotype.Service;

/**
 * 满减收费类
 *
 * @author 小呆呆
 * @create 2019-06-27 14:49
 **/
@Service
public class CashReduce implements Strategy {

//    double moneyCondition=0;
//    double moneyReduce=0;
//
//    public CashReduce(double moneyCondition, double moneyReduce){  // //如满300减100，传入300，100
//        this.moneyCondition = moneyCondition;
//        this.moneyReduce = moneyReduce;
//    }

    @Override
    public String type() {
        return "reduce";
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        // 操作数据 查询满减多少的业务逻辑
        double moneyCondition = 300 ;  // 查询的结果
        double moneyReduce = 100 ; // 查询的结果
        if (money > moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReduce;
        }
        return result;
    }
}
