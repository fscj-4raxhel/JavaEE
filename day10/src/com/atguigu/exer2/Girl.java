package com.atguigu.exer2;

public class Girl {
	
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void marry(Boy boy){
		System.out.println("我想嫁給" + boy.getName());
		boy.marry(this);
	}
	/**
	 * 
	* @Description 比較兩個對象的大小
	* @author Chris Jin
	* @date Feb 27, 20229:39:34 AM
	* @param girl
	* @return 正數：當前對象大；負數：當前對象小；0；當前對象與形參對象相等
	 */
	public int compare(Girl girl){
//		if(this.age > girl.age){
//			return 1;
//		}else if(this.age < girl.getAge()){
//			return -1;
//		}else{
//			return 0;
//		}
		
		return this.age - girl.age;
	}
	
}
