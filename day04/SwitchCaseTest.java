/*
��֧�ṹ֮����switch-case

1. ��ʽ
switch(���ʽ){
case ����1��
	ִ�����1��
	//break;
case ����2��
	ִ�����2��
	//break;
...
default:
	ִ�����n:
	//break;
}

2.˵����
�� ����switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧ��case
�ṹ�У�������ִ����䡣��������ִ����������Ȼ��������ִ������case�ṹ�е�ִ�����
ֱ������break�ؼ�����ߴ�switch-case�ṹĩβ����Ϊֹ��

�� break������ʹ����switch-case�ṹ�У���ʾһ��ִ�е��˹ؼ��֣�������switch-case�ṹ

�� switch�ṹ�еı��ʽ��ֻ�������µ�������������֮һ��byte��short��char��int��ö�����ͣ�JDK5.0��������String���ͣ�JDK7.0������

�� case֮��ֻ����������������������Χ

�� break�ؼ����ǿ�ѡ�ġ���������˵��������¶�����Ҫ�ӵ�

�� default���൱��if-else�ṹ�е�else
			default�ṹ�ǿ�ѡ�ġ�����λ��������
*/

class SwitchCaseTest{
	public static void main(String[] args){
		int number = 2;
		switch(number){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Other");
				break;
		}
	}
}