package com.dev.jdkproxy;

import java.lang.reflect.Proxy;

import org.testng.annotations.Test;

import com.dev.jdkproxy.service.impl.ForumServiceImpl;
import com.dev.proxy.service.ForumService;

public class ForumServiceTester {

	
	@Test
	public void addTipceTest(){
		ForumService target = new ForumServiceImpl();
		
		Performancehandle handle = new Performancehandle(target);
		
		ForumService proxy = (ForumService)Proxy.newProxyInstance(
													target.getClass().getClassLoader(),
													target.getClass().getInterfaces(),
													handle);
		proxy.addTipce();
	}
}
