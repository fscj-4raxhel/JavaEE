package com.atguigu.exer;

public class Person {

		String name;
		int age;
		/**
		 * 
		 *sex: 1 is Male; 0 is Female  
		 */
		int sex;
		
		public void study(){
			System.out.println("Studying");
		}
		
		public void showAge(){
			System.out.println("age: " + age);
		}
		
		public int addAge(int i){
			age += i;
			return age;
		}

			
}
