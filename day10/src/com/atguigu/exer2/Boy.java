package com.atguigu.exer2;

public class Boy {
	private String name;
	private int age;
	
	
	public Boy() {
	}
	
	public Boy(String name, int age) {
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
	
	public void marry(Girl girl){
		System.out.println("我想娶" + girl.name);
		
	}
	
	public void shout(){
		if(this.age >= 22){
			System.out.println("You are eligible to get married ");
		}else{
			System.out.println("You are not eligible to get married 娶");
		}
	}
	
	
}
