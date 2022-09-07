/*
do-while 循环的使用

一、循环结构的四个要素
①初始化条件
②循环条件 ---> 是boolean类型
③循环体

二、do-while循环的结构

①
do{
	③;
	④;
}while(②)

说明：
1.写while循环千万小心不要丢了迭代条件。一旦丢了，可能会导致死循环！
2. 我们写程序，要避免出现死循环。
3. for循环和while循环是可以互相转换的！
	区别：for循环和while循环的初始化条件作用域不同

算法：有限性。

执行过程：① - ③ - ④ - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1. do-while循环至少会执行一次循环体！


*/

class DoWhileTest{
	public static void main(String[] args){
		int num = 1;
		
		do{
			if(num % 2 == 0){
				System.out.println(num);
			}
		}while(num <= 100)
	}
}