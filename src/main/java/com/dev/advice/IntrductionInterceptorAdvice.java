package com.dev.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IntrductionInterceptorAdvice extends DelegatingIntroductionInterceptor
	implements Intrduction{
	
	private ThreadLocal<Boolean> isopen = new ThreadLocal<>();
	
	public void open(boolean isOpen){
		isopen.set(isOpen);
	}
	
	public Object invoke(MethodInvocation invocation) throws Throwable{
		Object obj;
		if(null!=isopen.get() && isopen.get()){
			long start = System.currentTimeMillis();
			System.out.println("开始进行性能监控:");
			obj = super.invoke(invocation);
			System.out.println("性能监控结束耗时:"+(System.currentTimeMillis()-start)+"毫秒");
		}else {
			obj = super.invoke(invocation);
		}
		 
		return obj;
	}
 
}
