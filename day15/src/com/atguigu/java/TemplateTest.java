package com.atguigu.java;
/*
 * 抽象类的应用: 模板方法的设计模式
 */
public class TemplateTest {
	public static void main(String[] args) {
		
		Template t = new SubTemplate();
		
		t.spendTime();
	}
}

abstract class Template{
	
	//计算某段代码计算的时间
	public void spendTime(){
		
		long start = System.currentTimeMillis();
		
		code();//不确定的, 易变的部分
		
		long end = System.currentTimeMillis();
		
		System.out.println("花费的时间为:" + (end - start));
	}
	
	public abstract void code();
} 

class SubTemplate extends Template{

	@Override
	public void code() {
		
		for(int i = 0; i < 10000; i++){
			boolean isPrime = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if( i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
		
	}
	
}

