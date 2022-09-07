class VariableTest4{
	public static void main(String[] args){
		//1. 编码情况1：
		long l1 = 123213;
		System.out.println(l1);
		//编译失败：过大的整数
		//long l1 = 2123123412341234;
		long l2 = 2123123412341234l;
		
		
		//*************************
		//编译失败
		//floag f1 = 12.3;
		
		//2. 编码情况2：
		//整型常量，默认类型为int型
		//浮点型常量，默认类型为double型
		byte b1 = 12;
		
		//byte b1 = b + 1;编译失败
		//float f1 = b + 12.3;编译失败
	}
}