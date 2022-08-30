package com.atguigu.java1;

import java.util.Date;

/*
 * 
 * 面试题： == 和 equals() 区别
 * 
 * 一、回顾 == 的使用：
 * ==：运算符
 * 1. 可以用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据类型的变量：比较两个变量保存的数据是否相等
 * 	   如果比较的是引用数据类型的变量：比较的是两个变量的地址值是否相等。即是否指向堆空间中同一个对象实体
 * 
 * 二、equals()方法的使用
 * 1. 是一个方法，而非运算符
 * 2. 只能适用于引用数据类型
 * 3. Object类中equals()的定义：
 * 		public boolean equals(Object obj) {
        	return (this == obj);
    	}
    	说明：Object类中定义的equals()和==的作用是相同的：即是否指向堆空间中同一个对象实体
    	
 * 4.像String、Date、File、包装类都重写了Object类中的equals()方法。重写以后，比较的不是
 * 	 两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
 * 
 * 5. 通常情况下，我们自定义类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。
 * 	      那么我们就需要对equals()进行重写.
 * 
 * 
 */
public class EqualsTest {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);//true
		System.out.println(i == d);//true
		
		boolean b = true;
		
		char c = 10;
		System.out.println(i == c);//true
		
		char c1 = 'A';
		char c2= 65;
		System.out.println(c1 == c2);//true
		
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1 == cust2);//false
		
		String str1 = new String("Tom");
		String str2 = new String("Tom");
		System.out.println(str1 == str2);//false
		
		System.out.println("**********************************");//false
		System.out.println(cust1.equals(cust2));//false
		System.out.println(str1.equals(str2));//true
		
		Date date1 = new Date(32442525324L);
		Date date2 = new Date(32442525324L);
		System.out.println(date1.equals(date2));
		
	}

}
