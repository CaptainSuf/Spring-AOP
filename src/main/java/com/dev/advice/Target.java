package com.dev.advice;

public class Target {

    public void add()throws Exception{
        System.out.println(this.getClass().getName()+"调用add()方法");
    }

    public void del()throws Exception{
        System.out.println(this.getClass().getName()+"调用del方法");
        if(1==1){
    		throw new RuntimeException();
    	}
    }
}
