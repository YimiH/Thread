package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 09:45
 */
public class MyTicketRunnable implements Runnable {
    private int tick=10;
    @Override
    public void run() {
        //同步块
        while(tick>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //若加锁的范围过大，会导致部分线程无法进入争抢CPU的使用权
            synchronized(this) {
                //双重检查，确保前提条件成立
                if (this.tick > 0) {
                    this.tick--;
                    System.out.println(Thread.currentThread().getName() + "购票,当前剩余票的数量：" + this.tick);
                }
            }
        }
    }

    public static void main(String[] args) {
        MyTicketRunnable run=new MyTicketRunnable();
        Thread thread1=new Thread(run,"黄牛1");
        Thread thread2=new Thread(run,"黄牛2");
        Thread thread3=new Thread(run,"黄牛3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
