package com.dev.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	private Enhancer enhancer = new Enhancer();

	public Object getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Performancemonitor.begin(obj.getClass().getName()+" "+method.getName());
		Object result = proxy.invokeSuper(obj, args);
		Performancemonitor.end();
		return result;
	}

	
	
	
}
