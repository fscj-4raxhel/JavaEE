package com.atguigu.java3;

import com.atguigu.java2.Order;

public class SubOrder extends Order {

	public void metho(){
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
//		orderDefault = 3;
//		orderPrivate = 4;
//		
//		methodDefault();
//		methodPrivate();
	}
	
	
}
