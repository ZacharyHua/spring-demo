package com.study.springdemo.spring.test;

import com.study.springdemo.SpringDemoApplication;
import com.study.springdemo.spring.OrderEvent;
import com.study.springdemo.spring.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDemoApplication.class)
public class SpringObserverTest {
    @Autowired
    OrderService orderService;

    @Test
    public void test(){
        orderService.saveOrder();
    }
}
