package com.dev.advisor;



public class Target {

    public void add()throws Exception{
        System.out.println(this.getClass().getName()+"调用add()方法");
    }

    public void del()throws Exception{
        System.out.println(this.getClass().getName()+"调用del方法");
    }
    
    public static void find()throws Exception{
        System.out.println("调用静态方法");
    }
}
