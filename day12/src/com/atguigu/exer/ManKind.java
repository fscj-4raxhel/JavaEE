package com.atguigu.exer;

public class ManKind {
	private int sex;
	private int salary;

	public ManKind() {

	}

	public ManKind(int sex, int salary) {
		super();
		this.sex = sex;
		this.salary = salary;
	}

	public void manOrWoman() {
		String info = (sex == 1) ? "man" : "woman";
		System.out.println(info);
	}

	public void employed() {
		String info = (salary > 0) ? "employeed" : "unemployeed";
		System.out.println(info);
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
