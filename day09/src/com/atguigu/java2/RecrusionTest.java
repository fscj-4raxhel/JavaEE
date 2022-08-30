package com.atguigu.java2;
/*
 * 递归方法的使用
 * 1. 递归方法：一个方法体内调用它自身
 * 
 * 2. 递归方法包含了一种隐式的循环，他会重复执行某段代码，但这种重复执行无需循环控制。
 * 递归一定要向一直方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 * 
 * */
public class RecrusionTest {
	
	
	public static void main(String[] args){
		RecrusionTest test = new RecrusionTest();
		
		System.out.println(test.getSum(100));
	}
	
	//例1:计算1-100之间所有自然数的和
	
//	int sum = 0;
//	for(int i = 1; i <= 100; i++){
//		sum +=i;
//	}
//	
	public int getSum(int n){
		if(n == 1){
			return 1;
		}else{
			return n + getSum(n-1);
		}
	}
	
	//例2:计算n的阶乘n!
	
	//例3:已知一个数列f(0) = 1, f(1) = 4, f(n+2) = 2 * f(n+1) + f(n)
	public int f(int n){
		if(n == 0){
			return 1;
		}else if(n == 1){
			return 4;
		}else{
			return 2 * f(n-1) + f(n-2);
		}
	}
	

}
