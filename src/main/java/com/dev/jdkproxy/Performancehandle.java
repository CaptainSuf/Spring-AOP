package com.dev.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Performancehandle implements InvocationHandler{

	private Object target;
	
	public Performancehandle(Object target) {
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Performancemonitor.begin(target.getClass().getName()+" "+method.getName());
		Object obj = method.invoke(target, args);
		Performancemonitor.end();
		return obj;
	}


	
	
	
}
