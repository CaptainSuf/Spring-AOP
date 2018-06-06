package com.dev.advisor;

import org.springframework.aop.Advisor;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

import com.dev.advice.BeforeAdvice;

public class AdvisorTester {
		
	
	@Test
	public void staticMethorAdvisor() throws Exception{
		// 代理工厂
        ProxyFactory proxy = new ProxyFactory();
        // 添加切面
        StaticAdvisor advisor = new StaticAdvisor();
        advisor.setAdvice(new BeforeAdvice());
        proxy.addAdvisor(new StaticAdvisor());
        // 添加代理
        //proxy.addAdvice(new BeforeAdvice());
        // 添加目标类
        proxy.setTarget(new Target());
        Target target = (Target) proxy.getProxy();
        target.add();
	}
	
}
