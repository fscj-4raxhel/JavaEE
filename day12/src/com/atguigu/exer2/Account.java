package com.atguigu.exer2;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	public Account() {
		super();
	}

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}

	public void withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			return;
		}
		System.out.println("余额不足");
	}

	public void deposite(double amt) {
		if (amt > 0) {
			balance += amt;
		}
	}

}
