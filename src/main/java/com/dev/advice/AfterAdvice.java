package com.dev.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object obj1, Method method, Object[] objects, Object obj) throws Throwable {
        System.out.println(obj.getClass().getName()+" "+method.getName()+"：开始后置增强");
    }
}
