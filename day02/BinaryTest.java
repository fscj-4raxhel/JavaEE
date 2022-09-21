/*
Different bases in computer and their representation in Java.

1. binary：0,1 carry for each two. Starts with 0b or 0B in Java
2. decimal: 0-9
3. octal: 0-7, carry for each 8. Starts with 0 in Java
4. hexadecimal: [0-9A-F], carry for each 16. Starts with 0x or 0X. Here a-f and A-F are the same.
   for example 0x21AF +1= 0X21B0

*/
class BinaryTest{
	public static void main(String[] args){
		int num1 = 0b110;
		int num2 = 110;
		int num3 = -0123;
		int num4 = 0x1AF01;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
	}
}