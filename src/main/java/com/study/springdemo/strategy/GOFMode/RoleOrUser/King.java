package com.study.springdemo.strategy.GOFMode.RoleOrUser;



import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Context;
import com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface.Strategy;
import com.study.springdemo.strategy.GOFMode.Features.AxeBehavior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 定义国王的角色
 *
 * @author 小呆呆
 * @create 2019-06-26 13:41
 **/
@Service
public class King  extends Context {

    public  King(){
        strategy = new AxeBehavior();
    }

    @Override
    public void display() {
        System.out.println("我是国王");
    }
}
