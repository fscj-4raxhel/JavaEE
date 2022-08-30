package com.atguigu.java1;
/*
 * 接口的使用
 * 1. 接口使用interface来定义
 * 2. Java中,接口和类是并列的两个结构
 * 3. 如何定义接口:定义接口中的成员
 * 		3.1 JDK7及以前: 只能定义全局常量和抽象方法
 * 			>全局常量:public static final的,但是书写时可以省略不写
 * 			>抽象方法:public abstract的方法
 * 
 * 		3.2 JDK8:除了定义全局常量和抽象方法意外,还可以定义静态方法和默认方法(略)
 * 
 * 4. 接口中不能定义构造器!意味着接口不可以实例化
 * 
 * 5. Java开发中,接口通过类去实现(implements)的方式来使用
 * 		如果实现类覆盖了接口中的所有抽象方法,则此实现类就可以实例化
 * 		如果实现类没有覆盖接口中所有的抽象方法,则此实现类仍未一个抽象类
 * 
 * 6. Java类可以实现多个接口 ---> 弥补了Java单继承性的局限性
 * 		格式: class AA extends BB implements CC,DD,EE
 * 
 * 7. 接口和接口之间的关系也叫继承,而且可以多继承
 * 
 * 
 * ****************************
 * 8. 接口的具体使用体现多态性
 * 
 * 9. 接口,实际上可以看做是一种规范
 * 
 * 面试题:抽象类和接口有哪些异同?
 * 
 */
public class InterfaceTest {

}

interface Attackable{
	void attack();
}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	public static final int MIN_SPEED = 1;
	
	//抽象方法
	public abstract void fly();
	//省略了public abstract
	void stop();
	
//	public Flyable(){}//Interfaces cannot have constructors
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("驾驶员减速停止");
	}
	
}

class Bullet extends Object implements Flyable,Attackable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}}

//*************

interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	
}