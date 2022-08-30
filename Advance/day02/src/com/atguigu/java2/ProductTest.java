package com.atguigu.java2;

/**
 * 线程通信的应用:经典例题: 生产者/ 消费者问题
 * 生产者 Productor 将产品交给店员 ( Clerk)，而消费者 (从店员处
 * 取走产品，店员一次只能持有固定数量的产品 比如 :20 ），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 *
 *
 *
 * @author Chris Jin
 * @create 2022-03-22 5:12 PM
 */

class Clerk{

    private int count = 0;

    //生产产品
    public synchronized void produceProduct() {
        if(count < 20){
            count++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + count + "产品");
            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    ////消费产品
    public synchronized void consumeProduct() {
        if(count > 0){
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + count + "产品");
            count--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": 开始生产产品....");
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": 开始消费产品....");
        while(true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
public class ProductTest {


    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");
        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        c1.start();
        p1.start();
    }
}
