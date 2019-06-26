package com.study.springdemo.strategy;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 *  订单收费计算服务
 */
@Service
public class FeeCalculationService {
    /**
     * 打折计算
     *
     * @param type
     * @param cost
     * @return
     */
    public double calculate(String type, double cost){
        // vip 打9.5折，普通用户原价
//        if ("vip".equals(type)) {
//            return cost * 0.95;
//        } else if ("normal".equals(type)) {
//            return cost;
//        } else {
//            return cost;
//        }
        return discountStrategyHashMap.get(type).discount(cost);
    }

    // 定义一个Map存储  打折策略  对象（策略针对类型的key） -->  对象本身（value）
    HashMap<String,DiscountStrategy> discountStrategyHashMap = new HashMap<>();
    public FeeCalculationService(List<DiscountStrategy> discountStrategies) {
        for (DiscountStrategy discountStrategy : discountStrategies) {
            discountStrategyHashMap.put(discountStrategy.type(), discountStrategy);
        }
    }
}
