package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 12:41
 */
public class TestSleep implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            Thread thread = new Thread("Thread-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }

    }
    public static void main(String[] args) {
        TestSleep run=new TestSleep();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

    }




}
