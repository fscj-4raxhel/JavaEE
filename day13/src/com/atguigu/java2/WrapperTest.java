package com.atguigu.java2;

import org.junit.Test;

/*
 * 包装类的使用
 * 1. java提供了8种基本数据类型的包装类，使得基本数据类型的变量具有类的特征
 * 
 * 2. 掌握的：基本数据类型、包装类、String三者之间的相互转换
 */
public class WrapperTest {
	
	//String类型 --->基本数据类型、包装类：调用包装类的方法parseXxx(String s);
	@Test
	public void test5(){
		String str1 = "123";
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);
		
		String str2 = "true111111";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
	
	
	//基本数据类型、包装类 ---> String类型：调用String重载的valueOf(Xxx xxx)
	@Test
	public void test4(){
		int num1 = 10;
		//方式一：连接运算
		String str1 = num1 + "";
		//方式二：调用String重载的valueOf(Xxx xxx)
		float f1 = 123.4f;
		String str2 = String.valueOf(f1);
		
		Double d1 = new Double(13.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
	/*
	 * JDK 5.0新特性：自动装箱 与 自动拆箱
	 */
	@Test
	public void test3(){
		int num1 = 10;
		//基本数据类型-->包装类的对象
		method(num1);
		
		//自动装箱：基本数据类型-->包装类的对象
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱：包装类--->基本数据类型
		int num3 = in1;//自动拆箱
	}
	
	public void method(Object obj){
		System.out.println(obj);
	}
	
	//包装类--->基本数据类型：调用包装类的xxxValue()
	@Test
	public void test2(){
		Integer int1 = new Integer(12);
		int i1 = int1.intValue();
		System.out.println(i1 + 1);
		
		Float f1 = new Float(12.3);
		float fl2 = f1.floatValue();
		System.out.println(fl2 + 1);
	}

	//基本数据类型 ---> 包装类：调用包装类的构造器
	@Test
	public void test1(){
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		//报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		
		Boolean b3 = new Boolean("true1234");
		
		System.out.println(b3);//false
		
	}
}
