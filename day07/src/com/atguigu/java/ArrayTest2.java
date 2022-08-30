package com.atguigu.java;
/*
 * 算法的考查：数组的复制、反转、查找（线性查找、二分查找）
 * */
public class ArrayTest2 {
	public static void main(String[] args){
		
		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		
		String[] arr1 = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			arr1[i] = arr[i];
		}
		
		//反转
		//方式一
//		for(int i = 0; i < arr.length / 2; i++){
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}
		
		//方式二
//		for(int i = 0, j = arr.length - 1; i < j; i++, j--){
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			
//		}
		
		//遍历
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		System.out.println("***********");
		//查找（搜索）
		//线性查找：
		
		String target = "CC";
		boolean isFound = false;
		for(int i = 0; i < arr.length; i++){
			if(target.equals(arr[i])){
				System.out.println("Found " + target + " at" + i);
				isFound = true;
				break;
			}
		}
		if(!isFound)
			System.out.println(target + " is not found.");
		
		//二分法查找：
		//前提：索要查找的数组必须有序
		
		int[] arr2 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int tar = -106;
		int ind = binarySearch(tar,arr2);
		System.out.println(tar + " is found at index " + ind);
	}
	
	private static int binarySearch(int target, int[] arr){
		if(arr == null || arr.length == 0){
			return -1;
		}
		int head = 0, tail = arr.length - 1, mid;
		while(head <= tail){
			mid = head + (tail - head) / 2;
			if(arr[mid] == target){
				return mid;
			}else if(target > arr[mid]){
				head = ++mid;
			}else{
				tail = --mid;
			}
		}
		
		return -1;
	}
}
