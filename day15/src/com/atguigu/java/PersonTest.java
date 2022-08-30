package com.atguigu.java;

/*
 * 抽象类的匿名子类
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		method(new Student());//匿名对象
		
		Worker worker = new Worker();
		method1(worker);//非匿名子类的非匿名对象
		
		method1(new Worker());//非匿名子类的匿名对象
		
		//创建了一个匿名子类的非匿名对象
		Person p = new Person(){
			@Override
			public void eat() {
			}

			@Override
			public void breath() {
			}
			
		};
		
		method1(p);
		
		//创建匿名子类的匿名对象
		method1(new Person(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("匿名子类的匿名子对象吃");
			}

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("匿名子类的匿名子对象呼吸");
			}
			
		});
		
		
//		method1(new Person(){}); 
	}
	
	public static void method1(Person p){
		p.eat();
		p.walk();
	}

	public static void method(Student s) {
	}
}

class Worker extends Person{

	@Override
	public void eat() {

	}

	@Override
	public void breath() {

	}
	
}

