package com.study.springdemo.strategy.test;

import com.study.springdemo.SpringDemoApplication;
import com.study.springdemo.strategy.FeeCalculationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 策略模式 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDemoApplication.class)
public class SpringStrategyTest {
    @Autowired
    FeeCalculationService feeCalculationService;
    @Test
    public void test(){
        // todo 当操作数据的type 类型不存在时，需要抛出一个异常
        double vipCost = feeCalculationService.calculate("vip",100);
        System.out.println("vip客户，您此次消费100，折后价格： " + vipCost);
        double normalCost = feeCalculationService.calculate("normal",100);
        System.out.println("normal客户，您此次消费100，折后价格： " + normalCost);

    }


}
