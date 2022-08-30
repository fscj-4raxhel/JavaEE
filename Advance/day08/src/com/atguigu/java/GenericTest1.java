package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Jin
 * @create 2022-04-21 8:48 PM
 */
public class GenericTest1 {
    @Test
    public void test1(){
        //如果定义了泛型类,实例化没有指明类的泛型,则认为此泛型类型为Object类型
        //要求:如果大家定义了类是带泛型的,建议在实例化是要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("Tom");

        //建议: 实例化时指明类的泛型
        Order<String> order1 = new Order<>("orderAA",123,"T is a String");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2(){
        SubOrder sub = new SubOrder();
        //由于子类在继承带泛型的父类时,指明了泛型类型.则实例化子类对象时,不需要在指明泛型
        sub.setOrderT(11222);
        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2>....");
    }

    @Test
    public void test3(){
        //泛型不同的引用不能互相赋值
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;

    }

    @Test
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        //泛型方法在调用时,指明泛型参数的类型
        List<Integer> integers = order.copyFromArryToList(arr);
        System.out.println(integers);
    }
}
