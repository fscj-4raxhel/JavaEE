package com.atguigu.java;

import static java.lang.Thread.*;

/**
 *
 *  * 例子: 创建三个窗口卖票,总票数为100张,使用实现Runnable接口的方式
 *
 *  1. 问题: 卖票过程中出现了重票、错票 --->出现了线程安全问题
 *  2. 问题出现的原因: 当某个线程操作车票的过程中,尚未操作完成时,其他线程参与进来,也操作(车票)共享数据
 *  3. 如何解决: 当一个线程操作共享数据的时候其他线程不能参与进来,直到线程a操作完共享数据是,其他线程才可以开始操作ticket.这种情况即使线程a出现了阻塞,也不能被改变
 *  4. 在Java中,我们通过同步机制来解决线程安全问题.
 *
 *      最初的两种方式:
 *      方式一:同步代码块
 *      synchronized(同步监视器){
 *          //需要被同步的代码
 *      }
 *      说明:  1.操作共享数据的代码,即为需要被同步的代码 --> 不能包含代码多了也不能少了
 *            2.多个线程共同操作的变量(数据)比如本问题中的ticket
 *            3.同步监视器,俗称:锁.任何一个类的对象都可以充当锁
 *                  要求:多个线程必须要公用同一把锁
 *              补充: 在实现Runnable接口创建多线程的方式中,我们可以考虑使用this充当同步监视器
 *
 *      方式二:同步方法
 *             如果操作共享数据的代码完整的声明咋一个方法中,我们不妨将此方法声明同步的
 *
 *  5. 同步的方式,解决了线程安全的问题. --- 好处
 *     操作同步代码时,只能有一个线程参与,其他线程等待.相当于时一个单线程的过程,效率低---局限性
 *
 *
 * @author Chris Jin
 * @create 2022-03-21 7:58 PM
 */

class Window1 implements Runnable{

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized(Window1.class) {
                if (ticket > 0) {
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票-票号为: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

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
