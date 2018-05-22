package com.dev.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object obj) throws Throwable {
        System.out.println(obj.getClass().getName()+" "+method.getName()+"：开始前置增强");
    }
}
