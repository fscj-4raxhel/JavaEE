package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order();
		
//		order.orderDefault = 1;//The field Order.orderDefault is not visible
		order.orderPublic = 2;
		
		
//		order.orderPrivate = 3; //The field Order.orderPrivate is not visible
		
//		order.methodDefault();//The method methodDefault() from the type Order is not visible
		order.methodPublic();
		
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
	}

}