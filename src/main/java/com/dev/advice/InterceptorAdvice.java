package com.dev.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterceptorAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		System.out.println(invocation.getClass().getName()+" "+invocation.getMethod().getName()+" :前置环绕增加强");
		Object obj = invocation.proceed();
		System.out.println(invocation.getClass().getName()+" "+invocation.getMethod().getName()+" :后置环绕增加强");
		return obj;
	}

	
}
