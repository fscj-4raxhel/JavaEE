package com.atguigu.java;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank1 = Bank.instance;
		Bank bank2 = Bank.instance;
		
		System.out.println(bank1 == bank2);
	}

}

class Bank{
	private Bank(){
		
	}
	
	public static Bank instance = new Bank();
	
}
