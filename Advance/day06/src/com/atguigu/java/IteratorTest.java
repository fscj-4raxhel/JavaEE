package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用Iterator接口(迭代器)遍历集合元素
 * 1. 内部的方法: hasNext() next();
 * 2. 集合对象每次调用iterator方法都会得到一个全新的迭代器对象,
 * 默认游标都在集合的第一个元素上边
 * 3. 内部定义了remove()方法,可以在便利的时候删除集合中的元素.此方法不同于集合直接调用remove
 * @author Chris Jin
 * @create 2022-03-31 1:42 PM
 */
public class IteratorTest {
    @Test
    public void tets1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

        //方式一:
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常:java.util.NoSuchElementException
//        System.out.println(iterator.next());
        //方式二: 不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }
        //方式三: 推荐
        while(iterator.hasNext()){
            //next(): 一旦被调用会做两件事: ①指针下移 ② 将下移以后集合位置上的元素返回
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //错误方式一: 跳着输出 而且会报异常
        Iterator iterator = coll.iterator();
//        while((iterator.next()) != null){
//            System.out.println(iterator.next());
//        }

        //错误方式二: 集合对象每次调用iterator方法都会得到一个全新的迭代器对象,
        // 默认游标都在集合的第一个元素上边
        while(coll.iterator().hasNext()){
            System.out.println(coll.iterator().next());
        }

    }

    //测试Iterator中的remove()
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }
        }

        iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
