package com.atguigu.java;

import java.util.Arrays;

/*
 * java.utils.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 * */
public class ArraysTest {

	public static void main(String[] args) {
		//1.boolean equals(int[] a,int[] b) 判断两个数组是否相等。
		int[] a1 = new int[]{1,2,3,4};
		int[] a2 = new int[]{1,3,2,4};
		boolean isEqual = Arrays.equals(a1, a2);
		System.out.println(isEqual);
		
		//2.String toString(int[] a) 输出数组信息。
		System.out.println(Arrays.toString(a1));
		
		//3.void fill(int[] a,int val) 将指定值填充到数组之中
		Arrays.fill(a1,10);
		System.out.println(Arrays.toString(a1));
		
		//4.void sort(int[] a) 对数组进行排序。
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		
		//5.int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。
		int[] a3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int index = Arrays.binarySearch(a3, 310);
		if(index < 0){
			System.out.println(210 + " is not found");
		}else{
			System.out.println(210 + " is not found at " + index);
		}

	}

}
