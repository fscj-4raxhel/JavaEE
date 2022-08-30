package com.atguigu.java1;
/*
 * 可变个数形参的方法
 * 
 * 1. jdk 5.0新增的内容
 * 2. 具体使用:
 * 		2.1可變個數形參的格式：數據類型 ... 變量名
 * 		2.2當調用可變個數形參的方法時，傳入的參數個數可以是：0個，1個，2個...
 * 		2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 * 		2.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换言之，他们不能共存
 * 		2.5带可变个数形参的方法中，可变个数形参必须声明在末尾
 * 		2.6可变个数形参的方法，最多只能声明一个可变形参
 * */

public class MethodArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodArgsTest test = new MethodArgsTest();
		
		test.show(12);
		test.show("hello");
		test.show(new String[]{"AA","BB"});
	}
	
	public void show(int i){}
	
	public void show(String s){}
	
	public void show(String ... strs){
		System.out.println("show(String ... strs)");
		for(int i = 0; i < strs.length; i++){
			System.out.println(strs[i]);
		}
	}
	
	//jdk 5.0 之前都是用String类型的数组
//	public void show(String[] args){}

}
