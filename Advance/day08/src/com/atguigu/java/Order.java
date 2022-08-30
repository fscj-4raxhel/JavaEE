package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Jin
 * @create 2022-04-21 8:43 PM
 */
public class Order<T> {
    String orderName;
    int orderId;

// 类的内部结构就可以使用类的泛型

    T orderT;
    public Order(){

    }

    public Order(String orderName, int orderId, T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT(){
        return this.orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //泛型方法: 在方法中出现了泛型的结构, 泛型参数与类的泛型参数没有任何关系
    //泛型方法所属的类是不是泛型类都没有关系
     public <E> List<E> copyFromArryToList(E[] arr){
         ArrayList<E> list = new ArrayList<>();
         for (E e : arr) {
             list.add(e);
         }
         return list;
    }

}
