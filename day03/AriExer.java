/*
�������һ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
����xxx��������£�
��λ����
ʮλ����
��λ����
*/
class AriExer{
	public static void main(String[] args){
	
	int number = 246;
	int ones = number % 10;
	int tens = number / 10 % 10;
	int hundreds = number / 100;
	
	System.out.println("��λ�ǣ�" + hundreds);
	System.out.println("ʮλ�ǣ�" + tens);
	System.out.println("��λ�ǣ�" + ones);
		
		
	}
}