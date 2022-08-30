package com.atguigu.exer;

public class Account {
	private int id;
	private String pwd = "000000";
	private double balance;

	private static double interestRate;
	private static double minBalance = 1.0;

	private static int init = 1001;// 用于自动生成ID

	public Account() {
		id = init++;
	}

	public Account(String pwd, double balance) {
		this();
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}

	public static double getMinBalance() {
		return minBalance;
	}

	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

}
