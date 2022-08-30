
package com.atguigu.java1;
/*
 * 类的结构之三：构造器(或构造方法、constructors)的使用
 * 
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的属性
 * 
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显示的定义了类的构造器了之后，系统就不再提供默认的空参构造器
 * 5.一个类中至少会有一个构造器
 * 
 * */
public class PersonTest {
	
	
	public static void main(String[] args){
		Person p = new Person();
		
		p.eat();
	}
	

}


class Person{
	
	String name;
	int age;
	
	//构造器
	public Person(){
		System.out.println("Person()....");
	}
	
	public Person(String name){
		name = this.name;
	}
	
	public void eat(){
		System.out.println("人吃饭");
	}
	
	public void study(){
		System.out.println("人学习");
	}
}