package com.atguigu.java;
/*
 * Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源
	耗尽等严重情况。比如：StackOverflowError和OOM。
	一般不编写针对性的代码进行处理。
 */
public class ErrorTest {
	public static void main(String[] args) {
		
		
		//Exception in thread "main" java.lang.StackOverflowError
		//栈溢出
//		main(args);
		//堆溢出 OOM
		Integer[] arr = new Integer[1024*1024*1024*1024*1024*1024*1024*1024*1024];
	}
}
