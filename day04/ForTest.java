/*
For 循环结构的使用
一、循环结构的四个要素
①初始化条件
②循环条件 ---> 是boolean类型
③循环体
④迭代条件
二、for循环的结构

for(①;②;④){
	③；
}

执行过程：① - ② - ③ - ④ -  ② - ③ - ④ - ... - ②

*/

class ForTest{
	public static void main(String[] args){
	
		for(int i = 1; i <= 5;i++){
			System.out.println("Hello World");
		}
		
		//练习：
		int num = 1;
		for(System.out.println('a');num <= 3; System.out.println('c'),num++){
			System.out.println('b');
		}//abcbcbc
		
		//例题：遍历100以内的偶数，输出所有偶数的和
		int sum = 0;
		for(int i = 1; i < 101; i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}

}