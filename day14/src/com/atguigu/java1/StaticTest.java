package com.atguigu.java1;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 * static 关键字的使用
 * 
 * 1. static：静态的
 * 2. static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3. 使用static修饰属性：静态变量、类变量
 * 		3.1属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性(实例变量)
 * 		实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
 * 				当修改其中一个对象的非静态属性时，不会导致其他对象中同样的属性值的修改。
 * 		静态变量：我们创建了类的多个对象，多个对象共享一个静态变量。当通过某一个对象修改静态变量时，
 * 				会导致其他对象调用此静态变量时，是修改过了的
 * 		3.2 static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载而加载。可以通过"类.静态变量"的方式进行调用
 * 			② 静态变量的加载要早于对象的创建
 * 			③ 由于类只会加载一次，则静态变量在内存中也会只有一份：存在方法区的静态域中。
 * 
 * 			④ 		类变量		实例变量
 * 			类		yes			no
 * 			对象		yes			yes
 * 
 * 		3.3 静态属性举例: System.out; Math.PI;
 * 
 * 
 * 4. 使用static修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过"类.方法"的方式进行调用
 * 		②			静态方法		非静态方法
 * 			类		yes			no
 * 			对象		yes			yes
 * 		③ 在静态方法中，只能调用静态的方法或属性
 * 		      非静态方法中，即可以调用非静态的属性和方法，也可以调用静态的属性和方法
 * 
 * 5. static注意点：
 * 		在静态方法内，不能使用this关键字、super关键字
 * 
 * 6. 在开发中如何确定一个属性是否声明为static？
 * 		> 属性时可以被多个对象索永祥的,不会随着对象的不同而不同的.
 * 		> 类中的常量尝尝也声明为static
 * 
 *	      在开发中如何确定一个方法是否声明为static？
 *		> 操作静态属性的方法，通常设置为静态的
 *		> 工具类中的方法，习惯上声明为static的。比如Math、Arrays、Collections
 */
public class StaticTest {
	public static void main(String[] args){
		
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		
		c1.nation = "CHINA";
		
		System.out.println(c2.nation);
		
		
	}
}

class Chinese{
	String name;
	int age;
	static String nation;
	
	public static void show(){
		System.out.println("我是一个中国人");
	}
}