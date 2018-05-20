package com.dev.cglibproxy;

import org.testng.annotations.Test;

import com.dev.cglibproxy.service.ForumService;
import com.dev.cglibproxy.service.impl.ForumServiceImpl;

public class ForumServiceTester {

	@Test
	public void addTipceTest(){
		CglibProxy proxy = new CglibProxy();
		ForumService forumService = (ForumService)proxy.getProxy(ForumServiceImpl.class);
		forumService.addTipce();
	}
	
}
