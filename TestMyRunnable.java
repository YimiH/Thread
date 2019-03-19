package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-08
 * 11:39
 */
public class TestMyRunnable {
    public static void main(String[] args) {
        /*Runnable runnable=new MyRunnable();
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);

        thread1.start();
        thread2.start();
*/
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        });
        /*
        * 通过实现Runnable接口，构造Thread对象，传递Runnable对象
        * 代理模式
        *
        * 接口-->Runnable
        * Thread implements Runnable  代理类-->对象 代理对象
        * MyRunnable implements Runnable 被代理类-->对象 被代理对象*/
    }
}
