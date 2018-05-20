package com.dev.jdkproxy.service.impl;

import com.dev.proxy.service.ForumService;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTipce(String id) {
		//Performancemonitor.begin("com.dev.proxy.service.impl removeTipce");
		System.out.println("模拟删除");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Performancemonitor.end();
	}

	@Override
	public void addTipce() {
		//Performancemonitor.begin("com.dev.proxy.service.impl removeTipce");
		System.out.println("模拟新增");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Performancemonitor.end();
	}

}
