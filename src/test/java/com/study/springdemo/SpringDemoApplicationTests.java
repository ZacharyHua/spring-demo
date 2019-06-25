package com.study.springdemo;

import com.study.springdemo.spring.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void test(){
        orderService.saveOrder();
    }
}
