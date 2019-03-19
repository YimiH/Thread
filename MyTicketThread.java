package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 09:37
 */
public class MyTicketThread extends Thread {
    //private static int tick=10;
    private int tick=10;

    public void run(){
        while(this.tick>0){
            this.tick--;
            System.out.println("本次购票成功，当前剩余票的数量："+ this.tick);
        }
    }

    public static void main(String[] args) {
        MyTicketThread thread1=new MyTicketThread();
        MyTicketThread thread2=new MyTicketThread();
        MyTicketThread thread3=new MyTicketThread();

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
