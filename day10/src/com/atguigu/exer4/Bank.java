package com.atguigu.exer4;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank(){
		customers = new Customer[10];
		int numberOfCustomer = 0;
	}
	
	public void addCustomer(String f, String l){
		if(numberOfCustomer < customers.length){
			//add one customer
			customers[numberOfCustomer++] = new Customer(f,l); 
		}else{
			System.out.println("No capacity to add more customers");
		}
	}
	
	public int getNumberOfCustomers(){
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		if(index < 0 || index > numberOfCustomer - 1){
			return null;	
		}else{
			return customers[index];
		}
	}
}
