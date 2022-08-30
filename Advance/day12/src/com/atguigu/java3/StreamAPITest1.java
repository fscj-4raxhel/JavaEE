package com.atguigu.java3;

import com.atguigu.java2.Employee;
import com.atguigu.java2.EmployeeData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 * @author Chris Jin
 * @create 2022-05-03 9:29 PM
 */
public class StreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1(){
        //filter(Predicate p) -- 接收Lambda,从流中排出某些元素
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        //练习: 查询员工表中薪资大于7000的员工的信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        //limit(long n) -- 截断流,是其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);
        //skip(long n) -- 跳过元素,返回一个扔掉了前 n 个元素的流. 若流中元素不足n个,则返回一个空流与limit(n)互补
        list.stream().skip(4).forEach(System.out::println);
        //distinct() -- 筛选, 通过流所生成的元素的hashCode() 和 equals() 去除重复元素
        list.add(new Employee(1010,"刘强东",40,8000));

    }


}
