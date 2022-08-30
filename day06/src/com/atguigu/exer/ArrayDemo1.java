package com.atguigu.exer;

import java.util.Scanner;

/*
 *  2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
	成绩>=最高分-10 等级为’A’
	成绩>=最高分-20 等级为’B’
	成绩>=最高分-30 等级为’C’
	其余 等级为’D’
 */


public class ArrayDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1. 使用Scanner读取学生个数
		System.out.print("请输入学生的个数：");
		int numStudent = sc.nextInt();
		//2. 创建数组，动态初始化
		int[] students = new int[numStudent];
		//3. 给数组的元素赋值
		int score, maxScore = 0;
		for(int i = 0; i < students.length; i++){
			System.out.print("请输入学生成绩：");
			score = sc.nextInt();
			if(score > maxScore){
				maxScore = score;
			}
			students[i] = score;
		}
		//4. 获取获取最高分
		
		//5. 根据学生成绩和最高分的差值，得到每个学生的等级
		char grade;
		for(int i = 0; i < students.length; i++){
			if(maxScore - students[i] <= 10){
				grade = 'A';
			}else if(maxScore - students[i] <= 20){
				grade = 'B';
			}else if(maxScore - students[i] <= 30){
				grade = 'C';
			}else{
				grade = 'D';
			}
			System.out.println("Student " + i + " has score " + students[i] + " and grade is " + grade);
		}

	}

}
