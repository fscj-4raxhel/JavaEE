package com.atguigu.exer;

public class Kids extends ManKind{

	private int yearsOld;

	public Kids() {
		super();
	}

	public Kids(int yearsOld) {
		super();
		this.yearsOld = yearsOld;
	}
	
	public void printAge(){
		System.out.println("I am " + yearsOld + " years old.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

}
