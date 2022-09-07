/*
Java 定义的数据类型

一、变量按照数据类型来分

	基本数据类型：
		整型：byte \ short \ int \ long
		浮点型： float \ double
		字符型： char
		布尔型： boolean
	
	引用数据类型：
		类(class)：
		接口(interface)：
		数组（array）：
		


*/

class VariableTest1{

	public static void main(String[] args){
	//1. 整型：byte(1 byte) \ short(2 bytes) \ int(4 bytes) \ long(8 bytes)
	//① byte范围： -128 ~ 127
	
	byte b1 = 12;
	byte b2 = 127;
	
	//byte = 128; 编译不通过
	System.out.println(b1);
	System.out.println(b2);
	//② 声明long型变量，必须以l或L结尾
	//③ 通常，定义整形变量时，使用int型
	short s1 = 123;
	
	//2. 浮点型： float (4 bytes) \ double(8 bytes)
	//① 浮点型，表示带小数点的数值
	//② float表示数值范围比long还大
	
	double d1 = 123.3;
	System.out.println(d1 + 1);
	//③ 定义float型时必须以f或者F结尾
	//④ 通常，定义浮点型变量时，使用double型
	float f1 = 12.3F;
	System.out.println(f1 + 1);
	
	//3. 字符型： char （1字符 = 2字节）
	//① 定义char型变量，通常用一对'', 内部只能写一个字符
	
	char c1 = 'a';
	
	System.out.println(c1);
	
	char c2 = '`';
	char c3 = '正';
	char c4 = 'ㄛ';
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	
	//② 表示方式： 1. 声明一个字符 2.转义字符 3.直接使用 Unicode 值来表示字符型常量
	char c5 = '\n';
	System.out.print("hello" + c5);
	System.out.println("world");
	
	char c6 = '\u0043';
	System.out.println(c6);
	
	//4. 布尔型： boolean
	//① 只能去两个值之一：true、false
	//② 尝尝在条件判断、循环结构中使用
	boolean bb1 = true;
	System.out.println(bb1);
	
	boolean isMarried = true;
	if(isMarried){
		System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
	}else{
		System.out.println("你可以多谈谈女朋友！");
	}
	
	
	}
}