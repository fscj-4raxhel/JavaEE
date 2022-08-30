package com.atguigu.exer4;

public class Account {
	
	private double balance;
	
	
	public Account(){}
	
	public Account(double init_balance){
		this.balance = init_balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void deposit(double amt){
		if(amt > 0){
			System.out.println("存入：" + amt + " 元");
			this.balance += amt;
		}else{
			System.out.println("输入的金额不合法");
		}
	}
	
	public void withdraw(double amt){
		if(amt <= this.balance){
			System.out.println("取出：" + amt + " 元");
			this.balance -= amt;
		}else{
			System.out.println("余额不足");
		}
	}
}
