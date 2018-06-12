package com.dev.advisor;


import com.dev.advice.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class AdvisorTester {


    @Test
    public void staticMethorAdvisor1() throws Exception{
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();
        proxy.setProxyTargetClass(true);
        // 添加切面
        StaticAdvisor advisor = new StaticAdvisor();
        advisor.setAdvice(new BeforeAdvice());
        proxy.addAdvisor(advisor);
        // 添加代理
        //proxy.addAdvice(new BeforeAdvice());
        // 添加目标类
        proxy.setTarget(new Target());
        Target target = (Target) proxy.getProxy();
        target.add();
        target.find();
    }
	
	@Test
	public void staticMethorAdvisor() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("com/dev/advisor/conf/spring.xml");
        Target target = context.getBean("staticAdvisorTarget",Target.class);
	    target.add();
	    target.find();
	}
	
}
