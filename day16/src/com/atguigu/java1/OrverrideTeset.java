package com.atguigu.java1;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写的规则值一:
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 */
public class OrverrideTeset {

	
}

class Superclass{
	public void method() throws IOException{
		
	}
}

class Subclass extends Superclass{
public void method() throws FileNotFoundException{
		
	}
}
