package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-08
 * 10:57
 */
//继承thread类，覆写run方法实现线程
public class thread extends Thread{
    private String message;
    public thread(String message){
        this.message=message;
    }
    public void run(){
        System.out.println(message);
    }

}
