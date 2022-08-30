package com.atguigu.java3;

/*
 * 
 * 类的成员之四：代码块(或初始化块)
 * 
 * 1. 代码块的作用：用来初始化类、对象
 * 2. 代码块如果有修饰的话只能使用static
 * 3. 分类：静态代码块 vs 非静态代码块
 * 
 * 4. 静态代码块
 * 		>内部可以有输出语句
 * 		>随着类的加载而执行，而且只执行一次
 * 		>作用：初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明顺序执行
 * 		>静态代码块的执行要先于非静态代码块的执行
 * 		>静态代码块内只能调用静态的属性、静态方法，不能调用非静态的结构
 * 
 * 
 * 5. 非静态代码块
 * 		>内部可以有输出语句
 * 		>随着对象的创建载而执行
 * 		>每创建一个对象，就执行一次非静态代码块
 * 		>作用：可以在创建对象是，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明顺序执行
 * 		>非静态代码块内可以调用静态的属性、静态方法，也可以调用非静态的属性、非静态的方法

 */
public class BlockTest {
	public static void main(String[] args) {
		String desc = Person.desc;
		
		Person p1 = new Person();
		Person p2 = new Person();
	}
}

class Person {
	String name;
	int age;
	static String desc = "我是一个人";

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 静态代码块
	static {
		System.out.println("Hello Static Code Block");
	}
	
	static {
		System.out.println("Hello Static Code Block - 2");
	}
	
	

	// 非静态代码块
	{
		System.out.println("Hello Code Block");
	}

	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
