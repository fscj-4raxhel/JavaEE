package com.atguigu.java;
/*
 * 
 * 自定义的数组工具类
 * 
 * */
public class ArrayUtil {

	
	
	//求数组的最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	
	//求数组的最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	
	//求数组的求和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 1; i < arr.length; i++){
				sum += arr[i];
		}
		return sum;
	}
	//求数组的平均值
	public int getAvg(int[] arr){
		
		return getSum(arr) / arr.length;
	}
	
	
	//反转一个数组
	public void reverse(int[] arr){
		for(int i = 0, j = arr.length - 1; i < j; i++, j--){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	
	
	//复制数组
	public int[] copy(int[] arr){
		return null;
	}
	
	//数组排序
	public void sort(int[] arr){
		
	}
	
	//遍历数组
	public void print(int[] arr){
		
	}
	
	//查找指定元素
	public int getIndex(int[] arr, int dest){
		
		return 0;
	}
	
}
