/*
��д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

˵����
1. if-else if-else�ṹ�ǿ���Ƕ�׵�
2. ���if-elseֻ��һ��ִ����䣬����ʡ�Դ����ţ����ǲ�����ʡ��
*/

import java.Math;

class IfExer{
	public static void main(String[] args){
		int x = 4;
		int y = 1;
		if(x > 2)
			if( y > 2)
				System.out.println(x + y);
			System.out.println("atguigu");
		else//�ͽ�ԭ��if(y>2)���
			System.out.println("x is " + x);
		
		//�κ���ϰ3�����㹷������
		ind dogAge = 6;
		if(dogAge > 0 && dogAge <= 2){
			System.out.println(dogAge * 10.5);
		}else{
			System.out.println((dogAge-2) *4 + 2 *10.5);
		}
		
		//�κ���ϰ4����λ�ȡһ���������10-99
		int value = (int)(Math.random() * 90 + 10)
		
		//��ʽ��[a,b] : (int)Math.random() * (b - a + 1) + a
	}
}