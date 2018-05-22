package com.dev.advice;

public class Target {

    public void add(){
        System.out.println(this.getClass().getName()+"调用add()方法");
    }

    public void del(){
        System.out.println(this.getClass().getName()+"调用del方法");
    }
}
