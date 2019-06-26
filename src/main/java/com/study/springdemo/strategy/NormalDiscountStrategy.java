package com.study.springdemo.strategy;

import org.springframework.stereotype.Service;

/**
 * 针对normal的打折策略 - 95折
 */
@Service
public class NormalDiscountStrategy implements DiscountStrategy {
    @Override
    public String type() {
        return "normal";
    }

    @Override
    public double discount(double cast) {
        return cast * 1;
    }
}
