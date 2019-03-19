package com.Yimm;



/**
 * Author: sy
 * Create:2019-03-11
 * 19:02
 * synchronized锁多对象
 */
public class TestSynMulMethod {

    public static void main(String[] args) {
        //为了防止进入循环前再对对象进行修改，用final修饰，使多个线程共用一个对象
        final Syn syc=new Syn();
        for(int i=0;i<5;i++){
            Thread thread=new MyThread2(syc);
            thread.setName("Thread-"+i);
            thread.start();
        }
    }

}


class Syn{
    //当前Sync对象的test方法是同步方法，
    // 如果多线程访问Sync对象同一个），若有多个对象则不会同步，因为锁的是对象的成员方法
    public synchronized void test(){
        System.out.println(Thread.currentThread().getName()+"开始执行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束执行");

    }
}

class MyThread extends Thread{
    public void run(){
        Syn syc=new Syn();
        syc.test();
    }
}

class MyThread2 extends Thread{
    //为了使线程共用同一个对象，将syc对象用final修饰
    private final Syn syc;

    public MyThread2(Syn syc){
        this.syc=syc;
    }

    @Override
    public void run(){
        syc.test();
    }
}


