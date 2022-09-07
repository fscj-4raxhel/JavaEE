/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。

说明：
1. if-else if-else结构是可以嵌套的
2. 如果if-else只有一个执行语句，可以省略大括号，但是不建议省略
*/

import java.Math;

class IfExer{
	public static void main(String[] args){
		int x = 4;
		int y = 1;
		if(x > 2)
			if( y > 2)
				System.out.println(x + y);
			System.out.println("atguigu");
		else//就近原则，if(y>2)配对
			System.out.println("x is " + x);
		
		//课后练习3：测算狗的年龄
		ind dogAge = 6;
		if(dogAge > 0 && dogAge <= 2){
			System.out.println(dogAge * 10.5);
		}else{
			System.out.println((dogAge-2) *4 + 2 *10.5);
		}
		
		//课后练习4：如何获取一个随机数：10-99
		int value = (int)(Math.random() * 90 + 10)
		
		//公式：[a,b] : (int)Math.random() * (b - a + 1) + a
	}
}