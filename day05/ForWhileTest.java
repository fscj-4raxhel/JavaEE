/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

*/

import java.util.Scanner;

class ForWhileTest{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int pCount = 0;
	int nCount = 0;
	
	while(true){
	
		in number = scan.nextInt();
		
		if(number > 0){
			pCount++;
		}else if(number < 0){
			nCount++;
		}else{
			break;
		}
	}
	 System.out.println("正数的个数为：" + pCount);
	 System.out.println("负数的个数为：" + nCount);
	
	}
}