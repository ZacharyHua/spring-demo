package com.study.springdemo.strategy;

import org.springframework.stereotype.Service;

/**
 * 针对VIP的打折策略 - 85折
 */
@Service
public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public String type() {
        return "vip";
    }

    @Override
    public double discount(double cast) {
        return cast * 0.85;
    }
}
