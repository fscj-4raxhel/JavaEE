package com.atguigu.exer;

public class KidsTest {
	public static void main(String[] args) {
		Kids someKid = new Kids(12);
		someKid.printAge();
		
		someKid.setSalary(1);
		someKid.setSex(0);
		
		someKid.employed();
		someKid.manOrWoman();
	}
}
