/*
���⣺��д���򣺴Ӽ���������2019��ġ�month���͡�day����Ҫ��ͨ������
������������Ϊ2019��ĵڼ��졣

˵����
1. ���ǿ���ʹ��switch-case�Ľṹ��������ת��Ϊif-else����֮��������
2. ����д��֧�ṹʱ�������ּ�����ʹ��switch-case��ͬ��switch�б��ʽ��ȡֵ�����̫�ࣩ��
�ֿ���ʹ��if-elseʱ����������ѡ��switch-case��ԭ��switch-caseִ��Ч���Ը�

*/

import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������2019����·�");
		int month = sc.nextInt();
		
		System.out.println("������2019�����");
		int day = sc.nextInt();
		
		int sumDays = 0;
		switch(month){
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		
		}
		System.out.println("2019��" + month + "��" + day + "���ǵ� " + sumDays +"��");
	}

}