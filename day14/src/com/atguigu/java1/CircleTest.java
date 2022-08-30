package com.atguigu.java1;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		
		Circle c3 = new Circle(3.14);
		
		System.out.println("圆c1的id为： " + c1.getId());
		System.out.println("圆c2的id为： " + c2.getId());
		System.out.println("圆c3的id为： " + c3.getId());
		
		System.out.println("创建的圆的个数为：" + Circle.getTotal());
		
	}
	
	

}

class Circle{
	
	private double radius;
	private int id;
	
	private static int total;//c
	private static int init = 1001;
	
	public Circle(){
		id = init++;
		total++;
	}
	
	public Circle(double radius){
		this();
		this.radius = radius;
	}
	
	private double findArea(){
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}
	
	
} 
