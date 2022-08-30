package com.atguigu.java2;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 一、构造器引用
 *      类似于方法引用, 函数式接口的抽象方法的形参列表和构造器的形参列表一直.
 *      抽象方法的返回值类型即为构造器所属的类的类型
 *
 * 二、数组引用
 *      大家可以把数据看成是一个特殊的类,数组引用就和构造引用就一样了
 *
 *
 * Created by shkstart
 */
public class ConstructorRefTest {
	//构造器引用
    //Supplier中的T get()
    //Employee中的空参构造器 Employee()
    @Test
    public void test1(){

        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println(sup.get().toString());
        System.out.println("************************");

        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get().toString());

        System.out.println("************************");
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get().toString());
    }

	//Function中的R apply(T t)
    //Employee中的Employee(int id)
    @Test
    public void test2(){
        Function<Integer,Employee> func1 = id -> new Employee(id);
        Employee emp = func1.apply(1001);
        System.out.println(emp.getId());

        System.out.println("************************");
        Function<Integer,Employee> func2 = Employee::new;
        emp = func1.apply(1002);
        System.out.println(emp.getId());


    }

	//BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer,String,Employee> func1 = (id,name) -> new Employee(id,name);
        Employee emp = func1.apply(1001,"Tom");
        System.out.println("id = " + emp.getId() + ",name = " + emp.getName());
        System.out.println("*********************");
        BiFunction<Integer,String,Employee> func2 = Employee::new;
        emp = func2.apply(1002,"Jerry");
        System.out.println("id = " + emp.getId() + ",name = " + emp.getName());
	}

	//数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer,String[]> func1 = len -> new String[len];
        String[] arr1 = func1.apply(5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("*******************");

        Function<Integer,String[]> func2 = String[]::new;
        String[] arr2 = func2.apply(10);
        System.out.println(Arrays.toString(arr2));

	}
}
