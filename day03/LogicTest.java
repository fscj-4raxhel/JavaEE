/*
运算符之四：逻辑运算符
&	|	!
&&	||	^


说明：
1. 逻辑运算符的运算数都是boolean类型
2. 区分 == 和 =

*/
class LogicTest{
	public static void main(String[] args){
		//区分 & 和 &&
		//相同点1：& 与 && 的运算结果相同
		//相同点2：当左侧的运算符都是true时，右侧都会被执行
		//不同点1: 当左侧的运算符都是false时，短路与的右侧不会被执行
		boolean b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println(num1);
		
		boolean b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println(num2);
		
		//区分 | 和 ||
		//相同点1：| 与 || 的运算结果相同
		//相同点2：当左侧的运算符都是false时，二者右侧都会被执行
		//不同点1: 当左侧的运算符都是true时，短路与的右侧不会被执行
	
	}
}