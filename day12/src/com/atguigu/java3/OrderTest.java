package com.atguigu.java3;

import com.atguigu.java2.Order;

public class OrderTest {
	public static void main(String[] args) {

		Order order = new Order();
		order.orderPublic = 1;
		order.methodPublic();
		
		
		//不在同一个包，没有继承关系，除了public什么都不能用
//		order.orderDefault = 1;
//		order.orderProtected = 2;
//		order.orderPublic = 3;
//		
//		order.methodDefault();
//		order.methodProtected();
//		order.methodPublic();
		
	}
}
