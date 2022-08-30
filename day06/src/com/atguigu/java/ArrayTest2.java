
package com.atguigu.java;
/* 5.二维数组的使用
* 	① 二维数组的声明和初始化
* 	② 如何调用数组的指定位置的元素
* 	③ 如何获取数组的长度
* 	④ 如何遍历数组
* 	⑤ 如数组元素的默认初始化值:
* 	⑥ 数组的内存解析:
*/


public class ArrayTest2 {

	public static void main(String[] args) {
		//1. 二维数组的声明和初始化
		int[] arr = new int[]{1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		
		//错误的情况
		//String[][] arr4 = new String[][4];
		//String[4][3] arr4 = new String[][];
		//int[][] arr4 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
		
		//正确
		int[] arr4[] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};//类型推断
		
		//2. 如何调用数组的指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
//		System.out.println(arr3[1][0]);//NPE
		
		arr3[1] = new String[5];
		System.out.println(arr3[1][0]);//null
		
		//3.获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length);//3
		System.out.println(arr4[1].length);//4
		
		//4.如何遍历二维数组
		for(int i = 0; i < arr4.length; i++){
			
			for(int j = 0; j < arr4[i].length; j++){
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
	}

}
