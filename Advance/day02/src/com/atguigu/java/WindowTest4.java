package com.atguigu.java;

/**
 *
 * 使用同步方法处理继承Thread类的线程安全问题
 * @author Chris Jin
 * @create 2022-03-22 9:50 AM
 */
class Window4 extends Thread {
    private static int ticket = 100;
//    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized  void show(){//同步监视器是 Window4.class
        //    private synchronized  void show(){//同步监视器是t1, t2, t3
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ": 卖票,票号为:" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
