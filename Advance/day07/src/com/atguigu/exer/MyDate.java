package com.atguigu.exer;

/**
 * @author Chris Jin
 * @create 2022-04-08 12:38 PM
 */
public class MyDate implements Comparable{
    private int year;
    private int moneth;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int moneth, int day) {
        this.year = year;
        this.moneth = moneth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoneth() {
        return moneth;
    }

    public void setMoneth(int moneth) {
        this.moneth = moneth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", moneth=" + moneth +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof MyDate){
            MyDate b = (MyDate)o;
            int yearDiff = this.year - b.year;
            if(yearDiff != 0){
                return yearDiff;
            }
            int monthDiff = this.moneth - b.moneth;
            if(monthDiff != 0){
                return monthDiff;
            }
            int dayDiff = this.day - b.day;
            return dayDiff;
        }else{
            throw new RuntimeException("输入的数据类型不匹配");
        }
    }
}
