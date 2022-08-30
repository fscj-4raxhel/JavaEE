package com.atguigu.java2;

/**
 * 使用两个线程交替打印1--100
 * @author Chris Jin
 * @create 2022-03-22 8:54 PM
 */

class Worker implements Runnable{
    private int count = 1;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                notify();
                if (count <= 100){
                    System.out.println(Thread.currentThread().getName() + "打印:" + count++);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}

public class InterleavingTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        Thread t2 = new Thread(worker);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();


    }
}
