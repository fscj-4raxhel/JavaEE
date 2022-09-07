/*
例题：编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序
输出输入的日期为2019年的第几天。

说明：
1. 凡是可以使用switch-case的结构，都可以转换为if-else。反之不成立。
2. 我们写分支结构时，当发现即可以使用switch-case（同事switch中表达式的取值情况不太多），
又可以使用if-else时，我们有限选择switch-case。原因：switch-case执行效率稍高

*/

import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入2019年的月份");
		int month = sc.nextInt();
		
		System.out.println("请输入2019年的天");
		int day = sc.nextInt();
		
		int sumDays = 0;
		switch(month){
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		
		}
		System.out.println("2019年" + month + "月" + day + "日是第 " + sumDays +"天");
	}

}