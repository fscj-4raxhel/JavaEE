package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 一、异常体系结构
 * java.lang.Throwable
 * 			|-----java.lang.Error:一般不编写针对性的代码进行处理
 * 			|-----ava.lang.Exception:可以进行异常的处理
 * 				|-----编译时异常(checked)
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 				|-----运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException
 * 					|-----ArrayIndexOutOfBoundsException
 * 					|-----ClassCastException
 * 					|-----NumberFormatException
 * 					|-----InputMismatcheException
 * 					|-----ArithmeticException
 * 
 * 面试题:常见的异常都有哪些?举例说明
 */
public class ExceptionTest {
	
	
	//**********************以下编译时异常**********************
	@Test
	public void test7(){
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//		int data = fis.read();
//		while(data != -1){
//			System.out.println((char)data);
//			data = fis.read();
//		}
//		fis.close();
	}
	
	
	//**********************以下运行时异常**********************
	//ArithmeticException
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	
	//InputMismatcheException
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
		
	}
	
	//NumberFormatException
	@Test
	public void test4(){
		String str = "123b";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException
	@Test
	public void test3(){
		Object obj = new Date();
		String str = (String)obj;
		
	}
	
	//ArrayIndexOutOfBoundsException
	@Test
	public void test2(){
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	//NullPointerException
	@Test
	public void test1(){
//		int[] arr = null;
//		System.out.println(arr[3]);
		
//		String str = "abc";
		String str = null;
		System.out.println(str.charAt(0));
	}
	
}
