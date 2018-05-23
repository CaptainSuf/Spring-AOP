package com.dev.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowAdvice implements ThrowsAdvice{

	public void  afterThrowing(Method method,Object[] args,Object obj,Throwable throwable) {
		System.out.println(obj.getClass().getName()+" "+method.getName()+" :异常增强");
	}
}
