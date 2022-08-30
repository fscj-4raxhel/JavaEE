package com.atguigu.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Chris Jin
 * @create 2022-03-27 2:06 PM
 */
public class JDK8DateTimeTest {
    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020,9,8);
        System.out.println(date1);//Fri Oct 08 00:00:00 EDT 3920
        Date date2 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(date2);//Tue Sep 08 00:00:00 EDT 2020

    }

    /*
    LocalDate、LocalTime、LocalDateTime 的使用
    说明:
            1. LocalDateTime相较于LocalDate、LocalTime用得多一点
            2. 类似于Calendar
     */
    @Test
    public void test1(){
        //now(): 获取当前的日期、时间、日期时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 10, 9, 0, 0);
        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性
        //withXxx(): 设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDate);
        System.out.println(localDateTime2);
        
        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);

    }

    /*
    Instant的使用
    类似于java.util.Date();
     */
    @Test
    public void test2(){
        //now(): 获取对应本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2022-03-27T18:21:14.168Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(-4));
        System.out.println(offsetDateTime);
        //toEpochMilli():获取自1970年1月1日0时0分0秒(UTC)开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);

        //ofEpochMilli(): 通过给定的毫秒数,获取Instant实例 --->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1648405421109L);
        System.out.println(instant1);



    }
    /*
        DateTimeFormatter: 格式化或解析日期、时间
        类似于SimpleDateFormat
         */
    @Test
    public void test3(){
        //方式一: 预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);
        //解析: 字符串 ---> 日期
        TemporalAccessor parse = formatter.parse("2022-03-27T14:30:21.043");
        System.out.println(parse);

        //方式二: 本地化相关的格式。如： ofLocalizedDateTime(FormatStyle.LONG)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//short: 3/27/22 2:33 PM


        //方式三: 自定义的格式。如： ofPattern(“yyyy MM dd hh:mm:ss”)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化: 日期 ---> 字符串
        String str3 = formatter2.format(LocalDateTime.now());
        System.out.println(str3);
        //解析:  字符串 ---> 日期
        TemporalAccessor parse1 = formatter2.parse("2022-03-27 02:38:48");
        System.out.println(parse1);
    }
}
