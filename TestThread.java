package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-08
 * 10:58
 */
public class TestThread {
    public static void main(String[] args) {
        thread thread1=new thread("线程1");
        thread thread2=new thread("线程2");
        thread thread3=new thread("线程3");

        //用start方法启动线程，线程启动后的执行具有随机性
        //若调用run方法并不会启动线程，只相当于调用普通类的方法
        thread1.start();
        thread2.start();
        thread3.start();

        //thread.run();
        /*for(int i=0;i<100;i++){
            System.out.println(i);
        }*/
        //System.out.println("这是main方法");
    }
}
