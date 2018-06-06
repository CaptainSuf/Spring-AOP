package com.dev.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class StaticAdvisor extends StaticMethodMatcherPointcutAdvisor{
		
	String[] rules = new String[]{"get","find","search"};
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		for(String rule:rules){
			if(method.getName().startsWith(rule)){
				return true;
			}
		}
		return false;
	}
	
	
}
