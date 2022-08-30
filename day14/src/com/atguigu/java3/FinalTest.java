package com.atguigu.java3;
/*
 * final：最终的
 * 
 * 1. final可以用来修饰的结构：类、方法、变量
 * 
 * 2. final用来修饰一个类:此类不能被其他类所继承
 * 		比如：String类、System类、StringBuffer类
 * 
 * 3. final用来修饰一个方法：不能被重写override
 * 		比如：Object类中getClass();
 * 
 * 4. final用来修饰变量：此时的"变量"就称为是一个常量
 * 		4.1 final修饰属性:可以考虑赋值的位置有:显示初始化、代码块中初始化、构造器中初始化
 * 		4.2 final修饰局部变量：
 * 			尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。
 * 			一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 * 
 * static final 用来修饰属性:全局常量
 */
public class FinalTest {
	
	final int WITH = 0;
	final int LEFT;
	final int RIGHT;
	
	{
		LEFT = 1;
	}
	
	public FinalTest(){
		RIGHT = 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class FinalA{
	
}

class AA{
	public final void show(){
		
	}
}

class BB extends AA{
	
	//Cannot override the final method from AA
//	public void show(){
//		
//	}
}

//class B extends FinalA{}//The type B cannot subclass the final class FinalA