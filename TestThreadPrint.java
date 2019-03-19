package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-11
 * 18:41
 */
public class TestThreadPrint{

    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public synchronized void run() {
                System.out.println("@#"+Thread.currentThread().getName());
            }
        };
        int i=0;
        for(i=0;i<5;i++){
            Thread thread=new Thread(run,"Thread-"+i);
            //此处线程的启动时间是不一定的
            synchronized (TestThreadPrint.class){
                thread.start();
            }
        }
    }
}
