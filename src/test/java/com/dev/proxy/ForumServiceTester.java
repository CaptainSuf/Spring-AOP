package com.dev.proxy;

import org.testng.annotations.Test;

import com.dev.proxy.service.ForumService;
import com.dev.proxy.service.impl.ForumServiceImpl;

public class ForumServiceTester {
	
	private ForumService forumService = new ForumServiceImpl();
	
	@Test
	public void removeTipceTest(){
		forumService.removeTipce("1");
	}
	
	@Test
	public void addTipceTest(){
		forumService.addTipce();
	}
}
