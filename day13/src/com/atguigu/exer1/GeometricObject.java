package com.atguigu.exer1;

public class GeometricObject {
	protected String coler;
	protected double weight;

	public String getColer() {
		return coler;
	}

	public void setColer(String coler) {
		this.coler = coler;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public GeometricObject() {
		super();
	}

	public GeometricObject(String coler, double weight) {
		super();
		this.coler = coler;
		this.weight = weight;
	}

	public double findArea() {
		return 0.0;
	}
}
