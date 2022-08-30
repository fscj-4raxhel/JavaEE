package ca.fscj.p0.service;

import ca.fscj.p0.bean.Customer;

public class CustomerList {
	private Customer[] customerList;
	private int total;

	public CustomerList() {
		customerList = new Customer[10];
	}

	public CustomerList(int capacity) {
		customerList = new Customer[capacity];
	}

	public boolean addCustomer(Customer cust) {
		if(total < customerList.length){
			customerList[total++] = cust;
			return true;
		}
		return false;
	}

	public boolean deleteCustomer(int index) {
		if(index >= 0 && index < total){
			for(int i = index; i < total - 1; i++){
				customerList[i] = customerList[i + 1];
			}
			customerList[--total] = null;
			return true;
		}
		return false;

	}

	public boolean replaceCustomer(int index, Customer cust) {
		if(index >= 0 && index < total){
			customerList[index] = cust;
			return true;
		}
		return false;

	}
	
	//This is so wrong!
	/*public Customer[] getAllCustomers(){
		return this.customerList;
	}*/
	
	public Customer[] getAllCustomers(){
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++){
			custs[i] = customerList[i];
		}
		return custs;
	}
	
	public Customer getCustomerAt(int index){
		if(index >= 0 && index < total) return customerList[index];
		return null;
	}
	
	public int getTotal(){
		return this.total;
	}

}
