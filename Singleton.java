package com.Yimm;

/**
 * Author: sy
 * Create:2019-03-11
 * 17:08
 */
public class Singleton {
    //此处volatile关键字使线程安全
    private static volatile Singleton singleton;
    private Singleton(){

    }
    /*获取实例化对象（单例）
    双重检查的单例*/
    public static Singleton getInstance() {
        //Class对象
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}
