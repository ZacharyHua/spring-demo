package com.study.springdemo.strategy.GOFMode;

import com.study.springdemo.SpringDemoApplication;
import com.study.springdemo.strategy.GOFMode.Features.SwordBehavior;
import com.study.springdemo.strategy.GOFMode.RoleOrUser.King;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author 小呆呆
 * @create 2019-06-26 14:13
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDemoApplication.class)
public class Test {
    @org.junit.Test
    public void test(){
        King king = new King();
        king.display();
        king.weaponWay();
        System.out.println("更换武器^");
        king.setWeapon(new SwordBehavior());
        king.weaponWay();
        System.out.println("……………………………………………………………………………………");
    }
}
