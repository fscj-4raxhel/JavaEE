/*
��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone xs max��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�


˵����
1. else �ṹ�ǿ�ѡ�ģ�����ʡ�Եģ�
2. ���ڶ���������ʽ:
	> �������֮���ǻ���Ĺ�ϵ��˳������ν
	> �������֮�����н����ģ���Ҫ����ʵ��������������Ӧ�ý��ĸ��ṹ����������
	> �������֮�����ǰ�����ϵ��ͨ���������Ҫ����ΧС�������ڷ�Χ������档����С�ľ�û�л���ִ����

*/

import java.util.Scanner;

class IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������С���ĳɼ���");
		int score = sc.nextInt();
		
		if(score == 100){
			System.out.println("����һ��BMW");
		}else if(score > 80){
			System.out.println("����һ̨iphone xs max");
		}else if(score > 60){
			System.out.println("����һ�� iPad");
		}else{
			System.out.println("ʲô����Ҳû��");
		}
	}
}