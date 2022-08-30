package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建现成的方式三: 实现Callable接口 --- JDK 5.0 新增
 *
 * 如何理解实现Callable接口比实现Runnable接口创建多线程更强大
 *
 * 1. call()有返回值
 * 2. call()可以抛出异常,被外面的操作不活,获取异常的信息
 * 3. Callable是支持泛型的
 *
 *
 * @author Chris Jin
 * @create 2022-03-23 8:45 AM
 */

//1. 创建一个实现Callable的实现类
class NumThread implements Callable {
    //2. 实现Call()方法
    @Override
    public Object call() throws Exception{
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if( i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();
        //4. 将此Callable接口的实现类的对象作为床底到FutureTask构造器中,创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);
        //5. 将FutureTask的对象作为参数传递到Thread类的构造器中,创建Thread对象,并调用start()
        new Thread(futureTask).start();

        try {
            //6. 获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call的返回值
            Object sum = futureTask.get();
            System.out.println("总和为" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
