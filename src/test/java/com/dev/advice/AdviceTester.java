package com.dev.advice;

import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

public class AdviceTester {

    @Test
    public void beforce(){
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new BeforeAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }

    @Test
    public void after(){
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new AfterAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }
}
