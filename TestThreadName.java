package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 10:46
 */
public class TestThreadName {
    public static void main(String[] args) {
        //获取线程的名称
        //1.Java Thread默认线程名称Thread-i-->不够友好

        /*for(int i=0;i<5;i++){
            final int j=i;
            Thread thread=new Thread(()->System.out.println(j));
            thread.start();
            System.out.println(thread.getName());
        }*/

        //2.用户创建线程，指定线程名称
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个后台监控QQ的线程");
            }
        },"Thread-QQ-Monitor");
        thread1.start();
        System.out.println(thread1.getName());


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                //获取当前线程
                Thread t=Thread.currentThread();
                System.out.println(t.hashCode());
                System.out.println("清理垃圾文件的线程");
            }
        });
        thread2.setName("Thread-Clear");
        System.out.println(thread2.hashCode());

        thread2.start();
        System.out.println(thread2.getName());
        System.out.println("main方法名称:"+Thread.currentThread().getName());
    }
}
