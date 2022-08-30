package com.atguigu.java;
/* 二维数组的使用：
* 	规定：二维数组分为歪成数组的元素，内层数组的元素
* 		int[][] arr = new int[4][3]
* 		外层元素：arr[0],arr[1],etc
* 		内层元素：arr[0][0],arr[1][2],etc
* 	⑤ 如数组元素的默认初始化值:
* 	针对于初始化方式一：int[][] arr = new int[3][4];
* 		外层元素的初始化值为：地址值
* 		内层元素的初始化值为：与一维数组的初始化情况相同
*   针对于初始化方式一：int[][] arr = new int[3][];
* 		外层元素的初始化值为：null
* 		内层元素的初始化值为：N/A
* 
* 	⑥ 数组的内存解析:
*/
public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//[I@15db9742
		System.out.println(arr[0][0]);//0
		
//		System.out.println(arr);//[[I@6d06d69c
		
		System.out.println("*************");
		
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);//[F@7852e922
		System.out.println(arr1[0][0]);//0.0
		
		System.out.println("*************");
		
		String[][] arr2 = new String[4][2];
		System.out.println(arr2[1]);//[Ljava.lang.String;@7852e922
		System.out.println(arr2[1][0]);//null
		
		System.out.println("*************");
		
		String[][] arr3 = new String[4][];
		System.out.println(arr3[1]);//null
//		System.out.println(arr3[1][0]);//NPE
	}

}
