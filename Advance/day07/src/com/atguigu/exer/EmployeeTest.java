package com.atguigu.exer;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Chris Jin
 * @create 2022-04-08 12:40 PM
 */
public class EmployeeTest {
    //使用定制排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    return b1.compareTo(b2);
                }else{
                    throw new RuntimeException("输入的数据类型不一致");
                }
            }
        });

        Employee e1 = new Employee("Tom",12,new MyDate(1991,2,5));
        Employee e2 = new Employee("Tom1",13,new MyDate(1990,2,5));
        Employee e3 = new Employee("Tom2",14,new MyDate(1989,2,5));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    //使用自然排序
    @Test
    public void test1(){
        TreeSet set = new TreeSet();

        Employee e1 = new Employee("Tom",12,new MyDate(1991,2,5));
        Employee e2 = new Employee("Tom1",13,new MyDate(1990,2,5));
        Employee e3 = new Employee("Tom2",14,new MyDate(1989,2,5));

        set.add(e1);
        set.add(e2);
        set.add(e3);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
