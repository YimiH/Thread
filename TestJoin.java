package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 14:36
 */
public class TestJoin {
    public static void main(String[] args) {
        System.out.println("主线程开始执行...");
        //用户定义的线程
        Thread thread1=new Thread(new MyJoinRunnable(),"Thread-time1");
        thread1.start();

        Thread thread2=new Thread(new MyJoinRunnable(),"Thread-time2");
        thread2.start();

        //用户定义的线程 执行完成后再进行主线程的代码执行
        //join:如果在一个当前线程（主线程或者其它线程）中调用一个线程对象的join方法，
        // 则当前线程阻塞，直到线程对象的run执行完毕当前线程阻塞解除
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程执行结束！！！");
    }


}



