package com.Yimm;

import java.time.LocalDateTime;

/**
 * Author: sy
 * Create:2019-03-08
 * 11:34
 */

//可以改变Java单继承的缺陷，并且它可以灵活的编码，并且可扩展以及共享

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("自定义Runnable接口:"+ LocalDateTime.now());
    }
}
