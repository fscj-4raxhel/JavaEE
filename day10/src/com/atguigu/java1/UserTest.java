package com.atguigu.java1;
/*
 * 总结：属性赋值的先后顺序
 * 
 * ① 默认初始化值
 * ② 显示初始化
 * ③ 构造器初始化
 * 
 * 
 * ④ 通过"对象.方法" 或 "对象.属性"的方法，赋值
 * 
 * 以上操作的先后顺序：① - ② - ③ - ④
 * 
 * */
public class UserTest {

	public static void main(String[] args) {
		User u  = new User();
		
		System.out.println(u.age);
		
		User u1 = new User(2);
		
		System.out.println(u1.age);

	}

}

class User{
	String name;
	int age = 1;
	
	
	public User(){}
	
	public User(int a){
		age = a;
	}
	
}
