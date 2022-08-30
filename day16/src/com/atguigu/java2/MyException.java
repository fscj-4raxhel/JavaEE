package com.atguigu.java2;
/*
 * 
 * 如何自定义异常类?
 * 1. 继承与现有的异常结构: RuntimeException、Exception
 * 2. 提供一个全局常量serialVersionUID
 * 3. 提供重载的构造器
 * 
 */
public class MyException extends RuntimeException{
	static final long serialVersionUID = -70397190745766939L;
	public MyException(){
		
	}
	
	public MyException(String msg){
		super(msg);
	}
}
