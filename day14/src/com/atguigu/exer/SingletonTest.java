package com.atguigu.exer;

public class SingletonTest {
	
}

class Singleton{
	
	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}