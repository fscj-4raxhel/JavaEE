/*
������������֮������й���

ǰ�᣺�������۵�ֻ��7�ֻ������ͱ���������㡣������boolean���͵ġ�

1. �Զ�����������
	���ۣ�������С���������͵ı�������������������͵ı���������ʱ������Զ�����Ϊ��������������͡�
	byte��short��char ---> int ---> long ---> float ---> double
	
	�ر�ģ���byte��short��char�������͵ı���������ʱ�����Ϊint��

2. ǿ������ת����

˵������ʱ��������Сָ���ǣ���ʾ���ķ�λ�Ĵ��С�����磺float����Ҫ����long������

*/
class VariableTest2{
	public static void main(String[] args){
		byte b1 = 2;
		int i1 = 129;
		//���벻ͨ��
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);
		
		float f = b1 + i1;
		System.out.println(f);
		
		short s1 = 123;
		double d1 = s1;
		
		// ***************�ر��*********************
		
		char c1 = 'a';
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		
		short s2 = 10;
		//���벻ͨ��
		//char c2 = c1 + s2;
		
		byte b2 = 10;
		//���벻ͨ��
		//char c3 = c1 + b2;
		
		//���벻ͨ��
		//short = b2 + s3;
		
		
		
	}
}