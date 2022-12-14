package com.atguigu.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程的方式四: 使用线程池
 *
 * 好处:
 * 1. 提高响应速度(减少了创建新线程的时间)
 * 2. 降低资源消耗(重复利用线程池中的线程,不需要每次都重建)
 * 3. 便于线程管理
 *      corePoolSize: 核心池的大小
 *      maximumPoolSize: 最大线程数
 *      keepAliveTime: 线程没有任务是最多保持多长时间后会终止
 * @author Chris Jin
 * @create 2022-03-23 9:18 AM
 */

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if( i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if( i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //设置线程池的属性
        System.out.println(service.getClass());
        //2.执行指定的线程的操作.需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());//适合使用于Runnable
        service.execute(new NumberThread1());//适合使用于Runnable
//        service.submit(Callable callable);//适合使用Callable
        service.shutdown();


    }
}
