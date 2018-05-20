package com.dev.jdkproxy;

public class Performancemonitor {

	private static ThreadLocal<MethodPerformance> performance = new ThreadLocal<>();
	
	
	public static void begin(String method){
		System.out.println("begin monitor...");
		performance.set(new MethodPerformance(method));
	}
	
	public static void end(){
		performance.get().printPerformance();
		System.out.println("end moitor");
	}
}
