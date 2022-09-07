/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆BMW；
成绩为(80，99]时，奖励一台iphone xs max；
当成绩为[60,80]时，奖励一个 iPad；
其它时，什么奖励也没有。
请从键盘输入岳小鹏的期末成绩，并加以判断


说明：
1. else 结构是可选的（可以省略的）
2. 对于多个条件表达式:
	> 如果条件之间是互斥的关系，顺序无所谓
	> 如果条件之间是有交集的，需要根据实际情况，考虑清楚应该将哪个结构声明在上面
	> 如果条件之间是是包含关系，通常情况下需要将范围小的声明在范围大的上面。否则小的就没有机会执行了

*/

import java.util.Scanner;

class IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入岳小鹏的成绩：");
		int score = sc.nextInt();
		
		if(score == 100){
			System.out.println("奖励一辆BMW");
		}else if(score > 80){
			System.out.println("奖励一台iphone xs max");
		}else if(score > 60){
			System.out.println("奖励一个 iPad");
		}else{
			System.out.println("什么奖励也没有");
		}
	}
}