/*
	This class demonstrates some common mistakes and edge cases that a Java programmer should be careful with.
*/
class VariableTest3{
	public static void main(String[] args){

		//1. This works but there is an implicit widening type casting.
		// 123213 is an int (not ending with l) so it will be casted into long then stored into l1
		long l1 = 123213;
		System.out.println(l1);
		//compiler error：out of range 2123123412341234 is 
		//long l1 = 2123123412341234;
		long l2 = 2123123412341234l;
		
		
		//*************************
		//Compiler error: 12.3 (not ending with f) is by default an double.
		//float f1 = 12.3;

		
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		byte b = 12; // This works for value [-128, 127].
		
		//byte b1 = b + 1; compiler error: b + 1 is int
		//float f1 = b + 12.3;compiler error: b + 12.3 is double
	}
}