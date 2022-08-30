package com.atguigu.exer2;

public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;
	
	public abstract double earnings();
	
	

	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}



	@Override
	public String toString() {
		return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString();
	}
	
	
}
