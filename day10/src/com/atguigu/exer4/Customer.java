package com.atguigu.exer4;

public class Customer {
	private String firstName;
	private String lastName;
	Account account;
	
	public Customer(String f, String l) {
		super();
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
	
}
