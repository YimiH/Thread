package com.Yimm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Author: sy
 * Create:2019-03-09
 * 10:18
 */
public class MyTicketCallable implements Callable<String> {
    private int tick=10;
    @Override
    public synchronized String call() throws Exception {
        while(this.tick>0){
            this.tick--;
            System.out.println("本次购票成功，当前剩余票的数量："+this.tick);
        }
        return "购票失败，票已售完";
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable=new MyTicketCallable();
        FutureTask<String> fun=new FutureTask<>(callable);

        Thread thread1=new Thread(fun);
        Thread thread2=new Thread(fun);
        Thread thread3=new Thread(fun);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(fun.get());

    }
}
