package com.atguigu.java2;

public class StudentTest {
	public static void main(String[] args) {
		
	try {
		Student s = new Student();
		s.regist(-1001);
		System.out.println(s.id);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	}
	
}

class Student{
	int id;
	
	public void regist(int id){
		if(id > 0){
			this.id = id;
		}else{
			throw new MyException("不能输入负数");
		}
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
	
}