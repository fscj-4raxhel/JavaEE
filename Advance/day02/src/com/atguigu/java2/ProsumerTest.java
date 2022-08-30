package com.atguigu.java2;


import static java.lang.Thread.sleep;

/**
 * @author Chris Jin
 * @create 2022-03-22 9:03 PM
 */

class Buffer{

    private int numberOfItems = 0;
    public synchronized void put(){
        if(numberOfItems < 20){
            notify();
            numberOfItems++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + numberOfItems + "个产品");
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void take(){
        if(numberOfItems > 0){
            notify();
            System.out.println(Thread.currentThread().getName() + "开始消费第" + numberOfItems + "个产品");
            numberOfItems--;
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 implements Runnable{
    private Buffer buffer;

    public Consumer1(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费...");
        while(true){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                buffer.take();

        }
    }
}

class Producer1 implements Runnable{
    private Buffer buffer;

    public Producer1(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产...");
        while(true){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                buffer.put();
        }
    }
}
public class ProsumerTest {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Consumer1 consumer = new Consumer1(buffer);
        Producer1 producer = new Producer1(buffer);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.setName("生产者");
        t2.setName("消费者");

        t1.start();
        t2.start();
    }
}
