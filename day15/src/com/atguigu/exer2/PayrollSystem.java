package com.atguigu.exer2;

public class PayrollSystem {
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("Bharathi", 1001, new MyDate(1991,11,03));
		emps[1] = new HourlyEmployee("Chris", 1002, new MyDate(1991,02,05));
		
		for(int i = 0; i < emps.length; i++){
			System.out.println(emps[i]);
		}
	}
}
