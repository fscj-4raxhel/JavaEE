package com.atguigu.exer1;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee b = new Manager("Bharathi",1001,5000,50000);
		b.work();
		Employee c = new CommonEmployee();
		c.work();
	}
}
