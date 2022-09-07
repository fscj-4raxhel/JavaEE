/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

说明：
1. if-else if-else结构是可以嵌套的
2. 如果if-else只有一个执行语句，可以省略大括号，但是不建议省略
*/

import java.util.Scanner;

class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入第一个整数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int num2 = sc.nextInt();
		System.out.println("请输入第三个整数");
		int num3 = sc.nextInt();
		
		int min,mid,max;
		
		if(num1 >= num2){
			if(num3 > num1){
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}else if(num3 <= num2 ){
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}else{
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}else{//num1 < num2
			if(num3 < num1){
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}else if(num3 >= num2 ){
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}else{
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}
	}

}