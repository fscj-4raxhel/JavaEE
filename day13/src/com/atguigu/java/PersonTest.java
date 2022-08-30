package com.atguigu.java;
/*
 * 面向对象特征之三：多态性
 * 
 * 1. 理解多态性：可以理解为一个食物的多种形态。
 * 2. 何为多态性：
 * 		对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * 
 * 3. 多态的使用：虚拟方法调用
 * 		有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类
 * 		重写父类的方法。
 * 		总结：编译看左边；运行看右边
 * 4. 多态性的使用前提：①要有类的继承关系 ②方法的重写
 * 
 * 5. 对象的多态性：只适用于方法，不适用与属性。编译和运行都看左边
 * 
 * 
 * *******************************************
 * 
 * 
 * */
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
//		**********************************************
		System.out.println("*********************************");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
		
//		Person p3 = new Woman();
		//多态的使用：当调用字符类同名同参数的方法时，实际执行的是子类重写方法的父类的方法---虚拟方法调用
		p2.eat();
		p2.walk();
		
		System.out.println(p2.id);
		
		//The method earnMoney() is undefined for the type Person
//		p2.earnMoney();
		
		System.out.println("*********************************");
		//不能调用子类所特有的方法、属性：编译时：p2是Person类型
//		p2.earnMoney();
		p2.name = "Tom";
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，
		//导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
		
		//如何才能调用子类特有的属性和方法？
		Man m1 = (Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		//使用强转时可能出现ClassCastException的异常
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
		
		/*
		 * instanceof 关键字的使用
		 * 
		 * a instanceof A: 判断对象a是否是类A的实例，如果是返回true;如果不是返回false;
		 * 
		 * 使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，
		 * 先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false,不进行向下转型
		 * 
		 * 如果a instanceof A返回true，则a instanceof B也返回true,其中类B是类A的父类。
		*/
		
		if(p2 instanceof Woman){
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("******Woman******");
		}
		
		if(p2 instanceof Woman){
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("******Man******");
		}
		
		if(p2 instanceof Person){
			System.out.println("******Person******");
		}
		
		//练习
		//问题一：编译时通过，运行时不通过
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
		
		//问题二：编译通过，运行时也通过
		Object obj = new Woman();
		Person p = (Person)obj;
		
//		//问题三：编译不过
//		Man m5 = new Woman();
		
	}

}
