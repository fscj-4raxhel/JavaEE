package com.atguigu.java;

import java.io.Serializable;

/**
 * Person类需要满足如下的要求, 方可序列化
 * 1. 实现Serializable接口
 * 2. 当前类提供一个全局常量(static final long) serialVersionUID
 *      private static final long serialVersionUID = -6849794470754667710L
 * 3. 除了当前Person类需要实现Serializable接口以外,
 *      还必须保证其内部所有属性也必须是可序列化的. 默认情况下,基本数据类型也是可序列化的
 *
 *  补充: ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量
 *
 * @author Chris Jin
 * @create 2022-04-26 7:59 PM
 */
public class Person implements Serializable{
    private static final long serialVersionUID = -6849794470752367710L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
