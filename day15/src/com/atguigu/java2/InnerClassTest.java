package com.atguigu.java2;

/*
 * 类的内部成员之五:内部类
 * 1. Java中允许讲一个类A声明在另一个类B中,则类A就是内部类,类B称为外部类
 * 
 * 2.内部类的分类:成员内部类 vs 局部内部类(方法内, 代码块内, 构造器内)
 * 
 * 3. 成员内部类:
 * 		一方面,作为外部类的成员:
 * 			>调用外部类的结构
 * 			>可以用static修饰
 * 			>可以被4种不同的权限修饰符修饰
 * 
 * 		另一方面,作为一个类:
 * 			> 类内可以定义属性,方法,构造器
 * 			> 可以被final修饰,表示此类不能被继承
 * 			> 可以被abstract修饰
 * 
 * 4. 关注如下三个问题:
 * 	4.1  如何实例化成员内部类的对象
 * 	4.2 如何在成员内部类中区分调用外部类的结构
 * 	4.3 开发中局部内部类的使用 see InnerClassTest1.java
 */
public class InnerClassTest {
	public static void main(String[] args) {

		//创建Dog实例(静态成员内部类)
		Person.Dog dog = new Person.Dog();
		//创建Bird实例(非静态的成员内部类)
//		Person.Bird bird = new Person.Bird();//错误的
		
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.sing();
		
		
		
		
	}
}

class Person {

	String name;
	int ge;

	public void eat() {
		System.out.println("人吃饭");
	}

	// 静态成员内部类
	static class Dog {
		String name;
		int age;

		public void show() {
			System.out.println("卡拉是条狗");
			// eat();
		}
	}

	// 非静态成员内部类
	class Bird {
		String name;

		public Bird() {

		}

		public void sing() {
			System.out.println("我是一只小小鸟");
			Person.this.eat();// 调用外部类的非静态属性
		}
		
		public void displayName(String name){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Person.this.name);
		}
	}

	public void method() {
		// 局部内部类
		class AA {

		}
	}

	{
		// 局部内部类
		class BB {

		}
	}

	public Person() {
		// 局部内部类
		class CC {

		}
	}
}
