package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 13:08
 */
public class TestYield{
    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    Thread.yield();
                    System.out.println(Thread.currentThread().getName()+"--"+i);
                }
            }
        };
        Thread thread1=new Thread(run,"Thread-A");
        Thread thread2=new Thread(run,"Thread-B");
        Thread thread3=new Thread(run,"Thread-C");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
