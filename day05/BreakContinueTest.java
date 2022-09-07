/*
break和continue关键字的使用
			使用范围		循环中的作用	相同点
break:		switch-case
			循环结构		结束当前循环	关键后面不能有执行语句

continue:	循环结构		结束当次循环	关键后面不能有执行语句

*/

class BreakContinueTest{
	public static void main(String[] args){
		
		for(int i = 1; i <= 10; i++){
		
			if(i % 4 == 0){
				//break; 123
				continue;//123567910
			}
			System.out.println(i);
		}
		
		//****************************
		label: for(int i = 1; i <= 10; i++){
		
			if(i % 4 == 0){
				//break; 123
				//continue;
				
				//break lable;//结束指定标识的一层循环结构
				continue label;//结束指定标识的一层循环结构当次循环
			}
			System.out.println(i);
		}
	
	
	}

}