/*
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���
һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
> �������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
> �������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
> ������������������㣬�򣺡����ޣ���
*/

import java.util.Scanner;

class IfExer1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)��
		
		System.out.println("�����������ߣ�cm����");
		int height = sc.nextInt();
		System.out.println("��������ĲƸ���ǧ�򣩣�");
		double wealth = sc.nextDouble();
		System.out.println("���������Ƿ�˧��");
		boolean isHandsome = sc.nextBoolean();
		
		if(height > 180 && wealth >= 1 && isHandsome){
			System.out.println("��һ��Ҫ�޸��k����");
		}else if(height > 180 || wealth >= 1 ||isHandsome){
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("���ޣ�");
		}
	}
}