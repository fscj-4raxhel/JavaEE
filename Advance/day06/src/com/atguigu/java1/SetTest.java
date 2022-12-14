package com.atguigu.java1;

import com.atguigu.java.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口的框架:
 * |----Set接口: 存储无序的、不可重复的数据. ---> 数学中的集合
 *                      |----HashSet: 作为Set接口的主要实现类;线程不安全;可以存储null值
 *                          |----LinkedHashSet: 作为HashSet的子类,遍历其内部数据时,可以按照添加的顺序遍历
 *                                              对于频繁的遍历操作,LinkedHashSet效率高于HashSet
 *                      |----TreeSet: 可以按照添加对象的指定属性,进行排序.
 * 1. Set接口中没有额外定义新的方法,使用的都是Collection中声明过的方法
 * 2. 要求: 向Set中添加的数据, 其所在的类一定要重写hashCode()和equals()
 *    要求: 重写的hashCode()和equals()尽可能保持一致性: 相等的对象必须具有相等的散列码
 *
 *
 * @author Chris Jin
 * @create 2022-03-31 4:01 PM
 */
public class SetTest {
    /*
        一、Set: 存储无序的、不可重复的数据
        以HashSet为例说明:
        1. 无序性: 不等于随机性. 存储的数据在底层数组中并非按照数组索引的顺序添加,而是根据数据的哈希值确定的

        2. 不可重复性: 保证添加的元素按照equals()判断是,不能返回true.即: 相同的元素只能添加一个

        二、添加元素的过程: 以HashSet为例:
            我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法,计算元素a的哈希值,
            此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置(即为: 索引位置),判断
            数组此位置上是否已经有元素:
                如果此位置上没有其他元素, 则元素a添加成功 ---> 情况1
                如果此位置上有其他元素b(或以链表形式存在的多个元素), 则比较元素a和元素b的hash值
                    如果hash值不相同,则元素a添加成功 ---> 情况2
                    如果hash值相同,则进而需要调用元素a所在类的equals()方法
                            equals()返回true,元素a添加失败
                            equals()返回false,则元素a添加成功 ---> 情况3
             对于添加成功的情况2和情况3而言: 元素a 与已经存在指定索引位置上数据以链表的方式存储.
             jdk 7: 元素a放在数组中, 指向原来的元素.
             jdk 8: 原来的元素放在数组中, 指向元素a.
             总结: 7上8下

             HashSet底层: 数组+链表的结构

     */
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",20));
        set.add(129);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    //LinkedHashSet的使用
    //LinedHasSet作为HashSet的子类,在添加数据的同事,每个数据还维护了两个索引.
    //记录此数据添加前后的元素的索引

}
