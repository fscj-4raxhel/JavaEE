/*
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：
*/
class AriExer{
	public static void main(String[] args){
	
	int number = 246;
	int ones = number % 10;
	int tens = number / 10 % 10;
	int hundreds = number / 100;
	
	System.out.println("百位是：" + hundreds);
	System.out.println("十位是：" + tens);
	System.out.println("个位是：" + ones);
		
		
	}
}