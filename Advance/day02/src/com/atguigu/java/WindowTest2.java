package com.atguigu.java;

/**
 * 例子: 创建三个窗口卖票,总票数为100张,使用继承Thread类的方式
 *
 * 说明:在继承Thead类创建多线程的方式中,慎用this作为同步监视器,可以考虑当前类
 *
 * @author Chris Jin
 * @create 2022-03-21 7:41 PM
 */

class Window2 extends Thread{
    private static int ticket = 100;
//    private static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(Window2.class) {//类也是对象 Class clazz = Window2.class;
                if (ticket > 0) {
                    System.out.println(getName() + ": 卖票,票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
