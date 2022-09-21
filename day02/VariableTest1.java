/*

This class demonstrates the 8 primitive types in Java

*/

class VariableTest1{

	public static void main(String[] args){
	//1. integers：byte(1 byte) \ short(2 bytes) \ int(4 bytes) \ long(8 bytes)
	//① range of byte： -128 ~ 127
	
	byte b1 = 12;
	byte b2 = 127;
	
	//byte = 128; Compiler error: out of range
	System.out.println(b1);
	System.out.println(b2);
	//② A number literal ends with l or L indicates a long value
	long l1 = 123l;

	//③ The default type to represent an integer is int
	short s1 = 123;
	
	//2. floats： float (4 bytes) \ double(8 bytes)
	//① floats represents numbers with a decimal point
	//② the range of numbers a float (4 bytes) can represent is larger than what a long (8 bytes) can represent
	
	//③ A number literal ends with f or F indicates a float value
	float f1 = 12.3F;
	System.out.println(f1 + 1);

	//④ The default type to represent a float point number is double
	double d1 = 123.3;
	System.out.println(d1 + 1);

	//3. char： char （1 character = 2 byte）
	//① A character is usually a single character embraced by a pair of ''.
	
	char c1 = 'a';
	
	System.out.println(c1);
	
	char c2 = '`';
	char c3 = '正';
	char c4 = 'ㄛ';
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	
	//② There are three ways to represent a character： 1. a character 2. escape sequence 3.Unicode value
	char c5 = '\n';
	System.out.print("hello" + c5);
	System.out.println("world");
	
	char c6 = '\u0043';
	System.out.println(c6);
	
	//4. boolean： boolean
	//Either true or false

	boolean bb1 = true;
	System.out.println(bb1);
	
	boolean isMarried = true;
	if(isMarried){
		System.out.println("Whoops! \\n You can't go on a \"bachelor \"party anymore！");
	}else{
		System.out.println("Go on a date!");
	}
	
	
	}
}