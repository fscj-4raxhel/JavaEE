package com.atguigu.exer1;

public class CylinderTest {

	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		
		double volume = cy.findVolume();
		System.out.println("The volume of the cylinder is " + volume);
		
		double area = cy.findArea();
		System.out.println("The area of the base circle is " + area);
		
		
		

	}

}
