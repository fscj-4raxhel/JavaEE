package com.atguigu.exer2;

public class HourlyEmployee extends Employee {

	private int wage;
	private int hour;

	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage * hour;
	}
	
	public String toString(){
		return "HourlyEmployee[" + super.toString() + "]";
	}

}
