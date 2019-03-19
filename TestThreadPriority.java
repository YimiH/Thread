package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 17:03
 */
public class TestThreadPriority {
    public static void main(String[] args) {
        Thread thread=new Thread();
        System.out.println("主线程优先级-->"+Thread.currentThread().getPriority());
        System.out.println("用户线程默认优先级-->"+thread.getPriority());
    }
}
