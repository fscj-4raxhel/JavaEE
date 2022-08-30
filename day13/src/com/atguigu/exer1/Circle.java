package com.atguigu.exer1;

public class Circle extends GeometricObject {
double radius;

public Circle(String coler, double weight, double radius) {
	super(coler,weight);
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

}
