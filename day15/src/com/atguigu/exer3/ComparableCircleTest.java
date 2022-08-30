package com.atguigu.exer3;

public class ComparableCircleTest {

	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(3.4);
		ComparableCircle c2 = new ComparableCircle(3.1);
		
		int res = c1.compareTo(c2);
		if(res > 0){
			System.out.println("c1 is bigger");
		}else if (res < 0){
			System.out.println("c2 is bigger");
		}else{
			System.out.println("They are equal");
		}

	}

}
