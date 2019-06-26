package com.study.springdemo.strategy.GOFMode.AbstractContextAndStrategyInterface;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 上线文对象  可以理解是一个角色Role
 * 把Strategy设计为Context的一个成员变量
 *
 * @author 小呆呆
 * @create 2019-06-26 13:30
 **/
@Component
@Service
public abstract class Context {

//    public void display(String type){
//        // 在这边仅仅是 演示调用关系  不需要 返回任何的信息
//        stringStrategyHashMap.get(type).useWeaPon();
//    }
//
//    HashMap<String,Strategy> stringStrategyHashMap = new HashMap<>();
//
//    private Context(List<Strategy> strategies){
//        for (Strategy strategy : strategies){
//            stringStrategyHashMap.put(strategy.type(),strategy);
//        }
//    }

    public Strategy strategy;
    public Context(){
    }

    public void setWeapon(Strategy Strategy) {
        this.strategy = Strategy;
    }
    protected abstract void display();

    public void weaponWay(){
        strategy.useWeaPon();
    }

}
