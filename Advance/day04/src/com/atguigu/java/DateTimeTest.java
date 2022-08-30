package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * JDK 8 之前的日期时间的API测试
 * 1. System类中currentTimeMillis();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 *
 * @author Chris Jin
 * @create 2022-03-26 8:53 PM
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用: SimpleDateFormat对日期Date类的格式化和解析
    1. 两个操作:
    1.1 格式化: 日期 ---> 字符串
    1.2 解析: 格式化的你过程, 字符串 ---> 日期

    2. SimpleDateFormat的实例化

     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat: 使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化: 日期 ---> 字符串
        Date date = new Date();
//        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析: 格式化的逆过程, 字符串 ---> 日期
        String str = "3/26/22 8:59 PM";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //********按照指定的方式格式化和解析: 调用带参的构造器**********************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析: 要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器形参体现)
        //否则,抛异常
        Date date2 = sdf1.parse("2022-04-10 12:12:12");
        System.out.println(date2);
    }

    /*
    练习一: 字符串"2022-09-08"转换为java.sql.Date
    练习二: "三天打鱼两天晒网" 1990-01-01 xxxx-xx-xx 打渔? 晒网?
     */
    @Test
    public void testExer() throws ParseException {
        String bd = "2022-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(bd);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);
    }

    /*
    Calendar日期类(抽象类)的使用
     */
    @Test
    public void testCalendar(){
        //1. 实例化
        //方式一: 创建器子类(GregorianCalendar)的对象
        //方式二: 调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());
        //2. 常用方法
        //get()
        int days = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //set()
        System.out.println(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(Calendar.DAY_OF_YEAR);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //getTime()
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime()
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }



}
