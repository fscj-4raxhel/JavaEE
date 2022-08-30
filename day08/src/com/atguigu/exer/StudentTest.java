package com.atguigu.exer;

public class StudentTest {
	public static void main(String[] args){
		Student[] stds = new Student[20];
		
		for(int i = 0; i < stds.length; i++){
			stds[i] = new Student();
			stds[i].number = i + 1;
			stds[i].state = (int)(Math.random() * 6) + 1;
			stds[i].score = (int)(Math.random() * 101);
		}
		
		//遍历学生数组
		for(int i = 0; i < stds.length; i++){
			System.out.println(stds[i].info());
		}
		
		for(int i = 0; i < stds.length; i++){
			if(stds[i].state == 3)
				System.out.println(stds[i].info());
		}
		
		//使用冒泡排序发按学生成绩排序，
		for(int i = 0; i < stds.length - 1; i++){
			for(int j = 0; j < stds.length - 1 - i; j++){
				if(stds[j].score > stds[j+1].score){
					//如果需要换序，交换的是数组的元素
					Student temp = stds[j];
					stds[j] = stds[j+1];
					stds[j+1] = temp;
				}
			}
		}
		
		System.out.println("*********************");
		//遍历学生数组
		for(int i = 0; i < stds.length; i++){
				System.out.println(stds[i].info());
		}
	}
}

class Student {
	int number;
	int state;
	int score;

	// 显示学生信息的方法
	public String info() {

		return "学号: " + number + "年级: " + state + "成绩: " + score;
	}
}