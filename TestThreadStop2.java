package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 16:08
 */
public class TestThreadStop2 {

    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(true){
                    i++;
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"Thread-stop2");
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //线程对象的stop方法已经弃用
        thread.stop();
    }
}
