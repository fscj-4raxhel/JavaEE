/*
This class demonstrates type casting in Java. boolean type is not considered here because it is
on its only island. There are two directions of casting:

1. Widening casting (automatically)：
	byte、short、char ---> int ---> long ---> float ---> double
	
	Note：when byte、short、char are operands, the result is in an int

2. Narrowing casting (manually)：
	Use () to manually cast into the embraced type.

	Note：Capacity is the range of values that the type can represent. Not the number of bytes this
	type uses. For example, float(4 bytes) > long(8 bytes)
	Casting from higher precision type to lower precision type may induce loss of precision.

*/
class VariableTest2{
	public static void main(String[] args){

		// ***************Widening casting*********************
		byte b1 = 2;
		int i1 = 129;
		//Compiler error
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);
		
		float f = b1 + i1;
		System.out.println(f);
		
		short s1 = 123;
		double d1 = s1;
		
		// ***************Specially*********************
		
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		
		short s2 = 10;
		//Compiler error
		//char c2 = c1 + s2;
		
		byte b2 = 10;
		//Compiler error
		//char c3 = c1 + b2;
		
		//Compiler error
		//short = b2 + s3;


		// ***************Narrowing casting*********************

		double d1 = 12.3;
		
		int i1 = (int)d1;//truncation
		System.out.println(i1);
		
		//No precision loss
		long l1 = 123;
		short s2 = (short)l1;
		
		int i2 = 128;
		byte b = (byte)i2;
		System.out.println(b);//-128
		
	}
}