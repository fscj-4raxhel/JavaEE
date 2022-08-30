package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1. List接口框架
 *     |----Collection接口: 单列集合,用来存储一个一个的对象
 *                  |----List接口 1.2 : 存储有序的、可重复的数据. ---> "动态"数组, 替换原有的数组
 *                      |----ArrayList 1.2: 作为List接口的主要实现类: 线程不安全的,执行效率高: 底层使用Object[] elementData存储
 *                      |----LinkedList1.2: 对于频繁的插入、删除操作,使用此类效率比ArrayList高: 底层使用双向链表存储
 *                      |----Vector: 作为List接口的古老实现类 1.0, 线程安全的,执行效率低: 底层使用Object[] elementData存储
 *
 * 2. ArrayList的源码分析:
 * 2.1 JDK7 的情况下
 *  ArrayList list = new ArrayList(); // 底层创建了长度是10的Object[] 数据 elementData
 *  list.add(123);//elementData[0] = new Integer(123);
 *  ...
 *  list.add(11);//如果此次的添加导致底层elementDate数组容量不够,则扩容
 *  默认情况下, 扩容为原来用量的1.5倍,同时需要将原有数组中的数据赋值到新的数组中.
 *
 *  结论: 建议开发中使用带参的构造器: ArrayList(int initialCapacity)
 *
 * 2.2 JDK 8中 ArrayList的变化:
 *  ArrayList list = new ArrayList(); //底层Object[] elementData初始化为{}.并没有创建长度为10的数组
 *  list.add(123);//第一次调用add()时,底层才创建了长度10的数组,并将数据123添加到elmentData中
 *  ...
 *  后续的添加和扩容操作与jdk 7无异
 *
 *  2.3 小结: JDK7中的ArrayList的对象的创建类似于单例的饿汉式,而JDK8中ArrayList的对象的创建类似于单例的懒汉式
 *
 *  3. LinkedList的源码分析:
 *      LinkedList list = new LinkedList(); 内部声明了Node类型的first和last属性,默认值为null
 *      list.add(123);//将123封装到Node中,创建了Node对象
 *
 *      其中,Node定义为
 *      private static class Node<E>{
 *          E item;
 *          Node<E> next;
 *          Node<E> prev;
 *
 *          Node(Node<E> prev, E element, Node<E> next){
 *          this.item = element;
 *          this.next = next;
 *          this.prev = prev;
 *          }
 *      }
 *
 * 4. Vector的源码分析: JDK7和JDK8中通过Vector()构造器创建对象时,底层都创建了长度为10的数组
 *      扩容方面,默认扩容为原来数组长度的2倍
 *
 * 面试题: ArrayList、LinkedList、Vector三者的异同?
 * 同: 三个类都实现了List接口, 存储数据的特点相同:有序的,可重复的数据
 * 不同:见上
 *
 * 5.
 *
 *
 * @author Chris Jin
 * @create 2022-03-31 2:08 PM
 */
public class ListTest {

    /*
        void add( int index, Object ele) 在 index 位置插入 ele 元素
        boolean addAll int index, Collection eles) 从 index 位置开始将 eles 中的所有元素添加进来
        Object get( int index): 获取指定 index 位置的元素
        int indexOf (Object obj) 返回 obj 在集合中首次出现的位置
        int lastIndexOf (Object obj) 返回 obj 在当前集合中末次出现的位置
        Object remove( int index): 移除指定 index 位置的元素，并返回此元素
        Object set( int index, Object ele) 设置指定 index 位置的元素为 ele
        List subList(int fromIndex , int toIndex) 返回从 fromIndex 到 toIndex

        总结: 常用方法
        增: add(Object obj)
        删: remove(int index) remove(Object obj)
        改: set(int index, Object ele)
        查: get(int index)
        插: add(int index, Object ele)
        长度: size()
        遍历: ①iterator();迭代器方式
              ②增强for循环
              ③普通for循环
     */
    @Test
    public void test3(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一:iterator();迭代器方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*****************************");
        //方式二:增强for循环
        for(Object obj: list){
            System.out.println(obj);
        }
        System.out.println("*****************************");

        //方式三: 普通for循环
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }

    @Test
    public void test2(){
        //int indexOf (Object obj) 返回obj在集合中首次出现的位置,如果不存在返回-1
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        int i = list.indexOf(4567);
        System.out.println(i);

        //int lastIndexOf (Object obj) 返回 obj 在当前集合中末次出现的位置
        int l = list.lastIndexOf(456);
        System.out.println(l);

        //Object remove( int index): 移除指定 index 位置的元素，并返回此元素
        Object obj = list.remove(0);
        System.out.println(list);
        System.out.println(obj);

        //Object set( int index, Object ele) 设置指定 index 位置的元素为 ele
        list.set(1,"cc");
        System.out.println(list);

        //List subList(int fromIndex , int toIndex) 返回从 fromIndex 到 toIndex左闭右开的子集合
        List list1 = list.subList(2, 4);
        System.out.println(list);
        System.out.println(list1);


    }
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);
        System.out.println(list);
        //void add(int index, Object ele): 在index位置插入ele元素
        list.add(1,"bb");
        System.out.println(list);

        // boolean addAll int index, Collection eles) 从 index 位置开始将 eles 中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);
        //Object get( int index): 获取指定 index 位置的元素
        System.out.println(list.get(0));


    }
}
