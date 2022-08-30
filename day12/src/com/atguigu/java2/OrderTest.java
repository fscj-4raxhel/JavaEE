package com.atguigu.java2;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderProtected = 2;
		order.orderPublic = 3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
		//同一个包的其他类，不能调用私有属性、方法
//		order.orderPrivate;//The field Order.orderPrivate is not visible
//		order.methodPrivate;//methodPrivate cannot be resolved or is not a field
	}
}
