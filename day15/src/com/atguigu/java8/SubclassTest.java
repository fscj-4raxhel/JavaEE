package com.atguigu.java8;

public class SubclassTest {
	public static void main(String[] args) {
		Subclass s = new Subclass();

		// s.method1();//The method method1() is undefined for the type Subclass
		// 知识点1:接口中定义的静态方法只能通过接口来调用.
		CompareA.method1();
		// 知识点2:通过实现类的对象,可以调用接口中的默认方法
		// 如果实现类重写了接口中的默认方法,调用时,仍然调用的是重写的方法
		s.method2();
		
		//知识点3:如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法
		//那么子类在没有重写此方法的情况下,默认调用的是父类中的同名同参数的方法 -->类优先原则
		//知识点4:如果实现类实现了多个接口,而多个接口中定义了同名同参数的默认方法
		//那么在实现类没有重写此方法的情况下,报错--->接口冲突.
		//必须在实现类中重写此方法
		s.method3();
	}
}

class Subclass extends Superclass implements CompareA,CompareB {

	public void method2() {
		System.out.println("Subclass:上海");
	}
	
	public void method3(){
		System.out.println("Subclass:深圳");
	} 
	
	//知识点5:如何在子类(或实现类的)方法中调用父类、接口中被重写的方法
	public void myMethod(){
		
		method3();//调用自己重写的方法
		super.method3();//调用父类中声明的
		//调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
}

class Superclass {
	public void method3() {
		System.out.println("Superclass:上海");
	}
}
