/*
运算符之六：三元运算符
1. 结构：(条件表达式)?表达式1:表达式2
2. 说明
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2
	如果条件表达式为true，则执行表达式1，反之执行表达式2
③ 表达式1 和表达式2 要求是一致的
④ 三元运算符可以嵌套

3. 凡是可以使用三元运算符的地方，都可以改写成if-else语句
	反之不成立
	
4. 如果既可以使用三元运算符，又可以使用if-else语句，那么优先选择三元运算符，简洁，执行效率高
*/

class TaneryTest{
	public static void main(String[] args){
		//获取两个整数的较大值
		int m = 12;
		int n = 5;
		
		int max = (m > n)?m:n;
		System.out.println(max);
		
		double num = (m > n)?2:1.0;
		
		//(m>n)? 2: "n大";
		
		String maxStr (m>n)?"m大" : (m==n)?"m和n一样大":"n大";
		
	}
}