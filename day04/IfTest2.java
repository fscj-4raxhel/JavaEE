/*
��д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

˵����
1. if-else if-else�ṹ�ǿ���Ƕ�׵�
2. ���if-elseֻ��һ��ִ����䣬����ʡ�Դ����ţ����ǲ�����ʡ��
*/

import java.util.Scanner;

class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.println("���������������");
		int num3 = sc.nextInt();
		
		int min,mid,max;
		
		if(num1 >= num2){
			if(num3 > num1){
				System.out.println(num2 + ", " + num1 + ", " + num3);
			}else if(num3 <= num2 ){
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}else{
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		}else{//num1 < num2
			if(num3 < num1){
				System.out.println(num3 + ", " + num1 + ", " + num2);
			}else if(num3 >= num2 ){
				System.out.println(num1 + ", " + num2 + ", " + num3);
			}else{
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		}
	}

}