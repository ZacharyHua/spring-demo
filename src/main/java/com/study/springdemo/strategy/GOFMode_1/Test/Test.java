package com.study.springdemo.strategy.GOFMode_1.Test;

import com.study.springdemo.SpringDemoApplication;
import com.study.springdemo.strategy.GOFMode_1.StrategyAndStrategyContext.CashContext;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试  客户端调用
 *
 * @author 小呆呆
 * @create 2019-06-27 15:27
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDemoApplication.class)
public class Test {
    @Autowired
    CashContext cashContext;

    @org.junit.Test
    public void Test(){
        //平常不打折,消费了1000
        System.err.println("平常："+cashContext.getResult(1000,"normal"));
        //国庆打8折，消费了1000
        System.err.println("国庆："+cashContext.getResult(1000,"rebate"));
        //元旦满300减100，消费了1000
        System.err.println("元旦："+cashContext.getResult(1000,"reduce"));
    }
}
