package com.atguigu.java;

import org.junit.Test;

import java.util.*;
import java.util.Map.*;

/**
 *
 * 泛型的使用
 * 1. jdk 1.5 新增的功能
 *
 * 2. 在集合中使用泛型:
 *  总结:
 *  ① 集合接口或集合类在jdk5.0时都修改为带泛型的结构
 *  ② 在实例化集合时,可以指明具体的泛型类型
 *  ③ 指明完以后,在集合类或接口中凡是定义类或接口时,内部结构使用到类的泛型的位置,都指定为实例化时指定的类型
 *      比如: add(E e) ---> 实例化以后add(Integer e)
 *  ④ 注意点: 泛型的类型必须是一个类, 不能是基本数据类型. 需要用到基本数据类型的位置,都需要使用包装类
 *  ⑤ 如果实例化时,没有指明泛型的类型.默认类型为java.lang.Object
 * 3. 自定义泛型结构: 泛型类、泛型接口、泛型方法
 * @author Chris Jin
 * @create 2022-04-21 8:18 PM
 */
public class GenericTest {
    //在集合中使用泛型之前的情况:
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求: 存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //问题一: 类型不安全
//        list.add("Tom");
        for(Object score : list){
            //问题二: 强转时可能出现ClassCastException
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }
    //在集合中使用泛型的情况:
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(65);
        //编译时,就会进行类型检查,保证数据的安全
//        list.add("Tom");
        //方式一:
//        for (Integer score : list) {
//            int stuScore = score;
//            System.out.println(stuScore);
//        }
        //方式二:
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //在集合中使用泛型的情况: 以HashMap为例
    @Test
    public void test3(){
        //jdk7的新特性,类型推断
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);

        //泛型的嵌套
        Set<Entry<String, Integer>> entries = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println("key = " + key + " value = " + value);

        }
    }
}
