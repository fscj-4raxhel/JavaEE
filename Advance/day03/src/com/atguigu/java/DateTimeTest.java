package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * JDK 8之前的日期和时间的API测试
 *
 * @author Chris Jin
 * @create 2022-03-25 10:07 PM
 */
public class DateTimeTest {

    /*
    java.util.Date类
           |---java.sql.Data类
    1. 两个构造器的使用

    2. 两个方法的使用
        >toString(): 显示当前的年、月、日、时、分、秒
        >getTime(): 获取当前Date对象的对应的毫秒数(时间戳)

    3. java.sql.Date对应着数据控中日期类型的变量
        >如何实例化
        >如何将java.util.Date对象转化为java.sql.Date对象
     */
    @Test
    public void test2(){
        //构造器一: Date(): 创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Fri Mar 25 22:12:22 EDT 2022
        System.out.println(date1.getTime());//1648260934659
        //构造器二: 创建指定时间戳的Date对象
        Date date2 = new Date(1648260934659L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(413412341234L);
        System.out.println(date3.toString());//1983-02-06
        //如何将java.util.Date对象转化为java.sql.Date对象
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());




    }

    //1. System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //返回当前时间与1970年01月01日0时0分0秒之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }
}
