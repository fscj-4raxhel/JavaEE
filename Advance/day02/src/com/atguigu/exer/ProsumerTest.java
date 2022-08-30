package com.atguigu.exer;

import static java.lang.Thread.sleep;

/**
 * 经典的生产者 / 消费者练习题
 *
 * @author Chris Jin
 * @create 2022-03-22 9:23 PM
 */

class Buffer {

    private int numberOfItems;

    public synchronized void take() {
        notify();
        if (numberOfItems > 0) {

            System.out.println(Thread.currentThread().getName() + "开始消费第" + numberOfItems + "个产品");
            numberOfItems--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void put() {
        notify();
        if (numberOfItems <20) {
            numberOfItems++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + numberOfItems + "个产品");

        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产....");
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buffer.put();
        }
    }
}

class Consumer implements Runnable {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费....");
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buffer.take();
        }
    }
}

public class ProsumerTest {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        Thread producerThread = new Thread(p);
        Thread consumerThread = new Thread(c);
        Thread consumerThread1 = new Thread(c);

        producerThread.setName("生产者");
        consumerThread.setName("消费者1");
        consumerThread1.setName("消费者2");

        producerThread.start();
        consumerThread.start();
        consumerThread1.start();
    }
}
