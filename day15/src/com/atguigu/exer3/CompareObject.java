package com.atguigu.exer3;

public interface CompareObject {
	//返回值是0,代表相等;若为正数,代表当前对象大;负数代表当前对象小
	public int compareTo(Object o);
}
