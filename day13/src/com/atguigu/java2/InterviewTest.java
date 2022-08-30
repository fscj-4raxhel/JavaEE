package com.atguigu.java2;

import org.junit.Test;

public class InterviewTest {

	@Test
	public void test1() {
		// 三元运算符的时候自动类型提升了，因为统一了类型
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);// 1.0
	}

	@Test
	public void test2() {
		Object o2;
		if (true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);
	}

	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
	}
}
