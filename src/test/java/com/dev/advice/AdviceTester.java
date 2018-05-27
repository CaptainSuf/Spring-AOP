package com.dev.advice;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class AdviceTester {

    @Test
    public void beforce()throws Exception{
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new BeforeAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }

    @Test
    public void after()throws Exception{
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new AfterAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }
    
    @Test
    public void methodInterceotor()throws Exception{
    	// 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new InterceptorAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }

    @Test
    public void afterThrow() throws Exception{
    	// 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new AfterThrowAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.del();
	}
    
    @Test
    public void intrductionInterceptor() throws Exception{
    	// 代理工厂
        ProxyFactory proxy = new ProxyFactory();
        //添加接口
        proxy.setInterfaces(Intrduction.class);
        //设置默认cglib代理
        proxy.setProxyTargetClass(true);
        // 添加代理
        proxy.addAdvice(new IntrductionInterceptorAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        
        target.add();
        
        Intrduction intrduction = (Intrduction)target;
        intrduction.open(true);
        
        target.add();
    }
    
    @Test
    public void proxyBean() throws Exception{
    	
    	ApplicationContext application = new ClassPathXmlApplicationContext("com/dev/advice/conf/spring.xml");
    	Target target = application.getBean("intrductionAdvice", Target.class);
    	target.add();
    	
    	Intrduction intrduction = (Intrduction)target;
        intrduction.open(true);
        
        target.add();
    	
    }
    
    @Test
    public void test()throws Exception{
        // 代理工厂
        ProxyFactory proxy = new ProxyFactory();

        // 添加代理
        proxy.addAdvice(new AfterAdvice());
        proxy.addAdvice(new BeforeAdvice());
        // 添加目标类
        proxy.setTarget(new Target());

        Target target = (Target) proxy.getProxy();
        target.add();
    }
}
