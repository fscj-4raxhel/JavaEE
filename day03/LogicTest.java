/*
�����֮�ģ��߼������
&	|	!
&&	||	^


˵����
1. �߼������������������boolean����
2. ���� == �� =

*/
class LogicTest{
	public static void main(String[] args){
		//���� & �� &&
		//��ͬ��1��& �� && ����������ͬ
		//��ͬ��2�����������������trueʱ���Ҳ඼�ᱻִ��
		//��ͬ��1: ���������������falseʱ����·����Ҳ಻�ᱻִ��
		boolean b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println(num1);
		
		boolean b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println(num2);
		
		//���� | �� ||
		//��ͬ��1��| �� || ����������ͬ
		//��ͬ��2�����������������falseʱ�������Ҳ඼�ᱻִ��
		//��ͬ��1: ���������������trueʱ����·����Ҳ಻�ᱻִ��
	
	}
}