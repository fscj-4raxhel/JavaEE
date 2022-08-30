package com.atguigu.exer2;

public class SalariedEmployee extends Employee{
	
	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		// TODO Auto-generated constructor stub
	}

	private double monthlySalary;

	@Override
	public double earnings() {
		return monthlySalary;
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){
		return "SalariedEmployee[" + super.toString() + "]";
	}

}
