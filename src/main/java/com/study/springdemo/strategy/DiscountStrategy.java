package com.study.springdemo.strategy;

import org.springframework.stereotype.Component;

/**
 *   打折策略 - 接口定义
 */

public interface DiscountStrategy {
    /**
     *  返回该策略针对的用户类型
     * @return
     */
    public String type();

    /**
     *  计算打折后的价格
     * @param cast
     * @return
     */
    public double discount(double cast);
}
