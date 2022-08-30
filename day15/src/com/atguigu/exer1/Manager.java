package com.atguigu.exer1;

public class Manager extends Employee {

	private double bonus;

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("管理员工,提高公司的运行效率");
	}

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

}
