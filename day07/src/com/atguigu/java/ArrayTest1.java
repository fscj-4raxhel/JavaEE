package com.atguigu.java;
/*
  
  	定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
	然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
	
	要求：所有随机数都是两位数。
	提示；
	[0,1) * 90 [0,90) + 10  [10,100) [10,99]
	(int)(Math.random() * (99 - 10 + 1) + 10)

 */
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 90 + 10);
			System.out.print(arr[i] + " ");
		}
		
		//求数组元素的最大值
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Maximum is: " + max);
		//求数组元素的最小值
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Minimum is: " + min);
		//求数组元素的总和
		int sum = 0;
		for(int i = 1; i < arr.length; i++){
				sum += arr[i];
		}
		System.out.println("Sum is: " + max);
		//求数组元素的平均
		double avg = 0;
		int count = 0;
		for(int i = 1; i < arr.length; i++){
			count += 1;
		}
		avg = sum / count;
		System.out.println("Sum is: " + avg);
		
	}

}
