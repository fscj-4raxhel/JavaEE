package com.atguigu.exer4;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为" + balance);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		bank.addCustomer("Chris","Jin");
		
		System.out.println("银行客户的个数为：" + bank.getNumberOfCustomers());
		
		bank.getCustomer(1).setAccount(new Account(100000));
		
		for(int i = 0; i < 8; i++){
			bank.addCustomer("" + i, "Jin");
			bank.getCustomer(i+2).setAccount(new Account(i*100));
		}
		
		System.out.println("银行客户的个数为：" + bank.getNumberOfCustomers());
		
		for(int i = 0; i < 10; i++){
			System.out.println(bank.getCustomer(i).getFirstName() + "has" + bank.getCustomer(i).getAccount().getBalance() + "money");
		}
	}

}
