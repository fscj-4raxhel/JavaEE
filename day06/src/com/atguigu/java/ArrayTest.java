package com.atguigu.java;
/*
 * 一、数组的概述
 * 1. 数组的理解：数组(Array)，是多个想同类型数据按照一定顺序排列的集合，并使用一个名字命名，
 * 并通过编号的方式对这些数据进行统一管理
 * 
 * 2. 数组的相关概念
 * >数组名
 * >元素
 * >角标、下标、索引
 * >数组的长度：元素的个数
 * 
 * 3. 数组的特点
 * 1)数组是有序排列的
 * 2)数组本身是引用数据类型，数组的元素既可以是基本数据类型也可以是引用数据类型
 * 3)创建数组对象会在内存中开辟一整块连续的空间
 * 4)数组的长度一旦确定，就不能修改
 * 
 * 4. 数组的分类
 * 	① 按照维数：一维数组、二维数组...
 * 	② 按照数组元素的类型分类：基本数据元素的数组、引用数据类型的数组
 * 
 * 5.一维数组的使用
 * 	① 一位数组的声明和初始化
 * 	② 如何调用数组的指定位置的元素
 * 	③ 如何获取数组的长度
 * 	④ 如何遍历数组
 * 	⑤ 如数组元素的默认初始化值： ArrayTest1.java
 * 	⑥ 数组的内存解析：ArrayTest1.java
 *
 */
public class ArrayTest {
	public static void main(String[] args){
		//① 一位数组的声明和初始化
		int num;//申明
		num = 10;//初始化
		int num1 = 10;//声明+初始化
		
		int[] ids;//声明
		//1.1静态初始化：数组的初始化和数组元素的赋值操作时事进行
		ids = new int[]{1001,1002,1003,1004};
		//1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//错误的写法：
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[];
//		int[] arr3 = new int[3]{1,2,3};
		
		
		//也是正确的写法：
		int[] arr4 = {1,2,3,4,5};//类型推断
		
		
		//总结：数组一旦初始化完成，其长度就确定了。
		
		//② 如何调用数组的指定位置的元素：通过角标的方式调用。
		//数组的角标（或索引）从0开始的，到数组的长度-1结束。
		names[0] = "James";
		names[1] = "Chris";
		names[2] = "Ivan";
		names[3] = "Jordan";
		names[4] = "Aiden";
//		names[5] = "Alice"; 编译不报错，运行报IOO
		
		//③ 如何获取数组的长度
		//属性：length
		
		System.out.println(names.length);
		System.out.println(ids.length);
		
//		④ 如何遍历数组
		for(int i = 0; i < names.length;i++){
			System.out.println(names[i]);
		}
	}
}
