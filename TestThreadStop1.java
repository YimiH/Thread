package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-09
 * 15:21
 */


/*
public class TestThreadStop1 implements Runnable {

    //flag:是否执行
    private volatile boolean flag=true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = false;
    }

    @Override
    public void run() {
        int i=0;
        while(flag) {
            i++;
            System.out.println(Thread.currentThread().getName() + " i=" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        Thread thread1=new Thread(new TestThreadStop1(),"Thread-stop1");
        thread1.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new TestThreadStop1().setFlag(false);

    }
}
*/


public class TestThreadStop1 extends Thread{
    private volatile boolean flag=true;
    public void run(){
        int i=0;
        while(flag){
            i++;
            System.out.println(Thread.currentThread().getName()+" i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) {
        Thread thread1=new TestThreadStop1();
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((TestThreadStop1) thread1).setFlag(false);
    }

}
