package com.atguigu.java1;
/*
 * 方法的形参的值传递机制：
 * 
 * 1. 形参：方法定义时，小括号内的参数
 * 	      实参：方法调用时，实际传递给形参的值就是实参
 * 
 * 2. 值传递机制：
 * 如果变量是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 * 如果变量是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 * 
 * 
 * */
public class ValueTransferTest1 {

	public static void main(String[] args) {
		ValueTransferTest1 test = new ValueTransferTest1();
		
		int m = 10;
		int n = 20;
		
		
		test.swap(m, n);
		System.out.println("m = " + m + " n = " + n);
	
	}
	
	public void swap(int m, int n){
		int temp = m;
		m = n;
		n = temp;
		
	}

}
