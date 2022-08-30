package com.atguigu.java;

import static java.lang.Thread.*;

/**
 * 使用同步方法解决Runnable接口的线程安全问题
 *
 * 关于同步方法的总结
 * 1. 同步方法仍然涉及同步监视器,只是不需要我们显示的声明
 * 2. 非静态的同步方法,同步监视器是: this
 *     静态的同步方法,同步监视器是: 当前类本身
 *
 * @author Chris Jin
 * @create 2022-03-22 9:45 AM
 */
class Window3 implements Runnable {

    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            show();
        }

    }

    private synchronized void show(){//同步监视器: this
        if (ticket > 0) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票-票号为: " + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
