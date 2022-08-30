package com.atguigu.java3;
/*
 * 对属性可以赋值的位置：
 * ① 默认初始化值
 * ② 显示初始化值
 * ③ 构造器中初始化
 * ④ 有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 * ⑤ 在代码块中赋值
 * 
 * 执行的先后顺序 ① - ② / ⑤ - ③ - ④
 */


class OrderTest{
	public static void main(String[] args) {
		Order o = new Order();
		System.out.println(o.orderId);
	}
}

class Order{
	
	{
		orderId = 4;
	}
	
	int orderId = 3;
}
