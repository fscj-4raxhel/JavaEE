package com.atguigu.exer;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		
		c1.radius = 1.1;
		
		System.out.println("Area of this circle is " + c1.findArea());
	}

}

class Circle{
	
	//属性
	double radius;
	
	//求圆面积
	public double findArea(){
		return Math.PI * radius * radius;
	}
}