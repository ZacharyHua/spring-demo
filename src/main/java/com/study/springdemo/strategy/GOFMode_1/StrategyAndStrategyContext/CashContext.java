package com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext;

import com.study.springdemo.strategy.GOFMode_1.StrategicRole.CashNormal;
import com.study.springdemo.strategy.GOFMode_1.StrategicRole.CashRebate;
import com.study.springdemo.strategy.GOFMode_1.StrategicRole.CashReduce;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 定义环境角色（Context）：用于连接上下文，即把促销活动推销给客户，这里可以理解为销售员
 *
 * @author 小呆呆
 * @create 2019-06-27 14:56
 **/
@Service
public class CashContext {

//    private Strategy cs = null;
//
//    public CashContext(String type) {
//        switch (type) {
//            case "normal":
//                CashNormal cashNormal = new CashNormal();
//                cs = cashNormal;
//                break;
//            case "rebate":
//                CashRebate cashRebate = new CashRebate(0.8);
//                cs = cashRebate;
//                break;
//            case "reduce":
//                CashReduce cashReduce = new CashReduce(300, 100);
//                cs = cashReduce;
//                break;
//        }
//    }`
//
//    public double getResult(double money , String type) {
//        return cs.acceptCash(money);
//    }

    public double getResult(double money , String type) {
        return stringStrategyMap.get(type).acceptCash(money);
    }

    Map<String,Strategy> stringStrategyMap = new HashMap<>();

    public CashContext(List<Strategy> strategies){
        for (Strategy strategy : strategies){
            stringStrategyMap.put(strategy.type(),strategy);
        }
    }
}
