package com.atguigu.exer;

public class AccountTest {
	public static void main(String[] args) {

		Account acct1 = new Account();
		Account acct2 = new Account("qwerty",2000);
		
		Account.setInterestRate(0.012);
		Account.setMinBalance(100);
		
	}

}
