package com.atguigu.java2;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * 1. 泛型在继承方面的体现
 *
 * 2. 通配符的使用
 *
 * @author Chris Jin
 * @create 2022-04-21 9:26 PM
 */
public class GenericTest {
    /*
    1. 泛型在继承方面的体现

    类A是类B的父类, G<A>和G<B>不具备子父类关系
    补充:类A是类B的父类, A<G>和B<G>
     */
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;

        //list1 和 list2 不具有子父类关系

    }

    @Test
    public void test2(){
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();
    }

    /*
    2. 通配符的使用
    通配符: ?
    类A是类B的父类, G<A>和G<B>是没有关系的,二者共同的父类是G<?>


     */
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        //

        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        //添加: 对于List<?>就不能向其内部添加数据.
        list = list3;
        //除了添加null之外
        list.add(null);

        //获取(读取): 允许读取数据,读取的数据类型为Object
        Object o = list.get(0);
        System.out.println(o);

    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /*
    3. 有限制条件的通配符的使用
        ? extends A:
            G<? extends A> 可以作为G<A>和G<B>的父类的,其中B是A的子类

        ? super B:
            G<? super A> 可以作为G<A>和G<B>的父类的,其中B是A的父类
     */
    @Test
    public void test4(){
        List<? extends Person> list1 =null;
        List<? super Person> list2 = null;

        List<Students> list3 = null;
        List<Person> list4 = null;
        List<Object> list5 = null;

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2 = list3;
        list2 = list4;
        list2 = list5;
    }
}
