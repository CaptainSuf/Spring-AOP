package com.dev.jdkproxy;

public class MethodPerformance {

	private long begin;
	
	private long end;

	private String method;
	
	public MethodPerformance(String method) {
		this.method = method;
		this.begin=System.currentTimeMillis();
	}
	
	public void printPerformance(){
		this.end = System.currentTimeMillis();
		System.out.println(method+"花费"+(end-begin)+"毫秒");
	}
	
	
}
