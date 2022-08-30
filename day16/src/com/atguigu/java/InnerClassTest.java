package com.atguigu.java;

public class InnerClassTest {
	/*
	 * 在局部内部类的方法中比如(show())如果调用局部内部类所声明的方法中的局部变量的话,
	 * 要求此局部变量声明为final的
	 * 
	 * JDK7 及之前的版本:要求此局部变量显式地声明为final的
	 * JDK8 及之后的版本:可以省略final的声明
	 * 
	 */
	
	public void onCreate(){
		
//		int number = 10;
//		
//		button.setOnClickListener(new View.onClickListener(){
//			public void onClick(){
//				System.out.println("Hello");
//				System.out.println(number);
//			}
//		});
	}
	
	public void method(){
		//局部变量
		int num = 10;
		
		class AA{
			public void show(){
//				num = 20;//Local variable num defined in an enclosing scope must be final or effectively final
				System.out.println(num);
			}
		}
	}
}

