package com.atguigu.java1;

/**
 * @author Chris Jin
 * @create 2022-04-29 3:44 PM
 */

@MyAnnotation(value="hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Person(){}

    @MyAnnotation(value="abc")
    private Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @MyAnnotation(value="hi")
    private void show(String nation){
        System.out.println("我的国籍是" + nation);

    }

    public String display(String interests){
        return interests;
    }
    @Override
    public void infO() {

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
