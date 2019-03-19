package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 14:45
 */
public class MyJoinRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行...");
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程执行结束！！！");
    }
}
