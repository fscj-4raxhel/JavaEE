/*
Java �������������

һ����������������������

	�����������ͣ�
		���ͣ�byte \ short \ int \ long
		�����ͣ� float \ double
		�ַ��ͣ� char
		�����ͣ� boolean
	
	�����������ͣ�
		��(class)��
		�ӿ�(interface)��
		���飨array����
		


*/

class VariableTest1{

	public static void main(String[] args){
	//1. ���ͣ�byte(1 byte) \ short(2 bytes) \ int(4 bytes) \ long(8 bytes)
	//�� byte��Χ�� -128 ~ 127
	
	byte b1 = 12;
	byte b2 = 127;
	
	//byte = 128; ���벻ͨ��
	System.out.println(b1);
	System.out.println(b2);
	//�� ����long�ͱ�����������l��L��β
	//�� ͨ�����������α���ʱ��ʹ��int��
	short s1 = 123;
	
	//2. �����ͣ� float (4 bytes) \ double(8 bytes)
	//�� �����ͣ���ʾ��С�������ֵ
	//�� float��ʾ��ֵ��Χ��long����
	
	double d1 = 123.3;
	System.out.println(d1 + 1);
	//�� ����float��ʱ������f����F��β
	//�� ͨ�������帡���ͱ���ʱ��ʹ��double��
	float f1 = 12.3F;
	System.out.println(f1 + 1);
	
	//3. �ַ��ͣ� char ��1�ַ� = 2�ֽڣ�
	//�� ����char�ͱ�����ͨ����һ��'', �ڲ�ֻ��дһ���ַ�
	
	char c1 = 'a';
	
	System.out.println(c1);
	
	char c2 = '`';
	char c3 = '��';
	char c4 = '��';
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	
	//�� ��ʾ��ʽ�� 1. ����һ���ַ� 2.ת���ַ� 3.ֱ��ʹ�� Unicode ֵ����ʾ�ַ��ͳ���
	char c5 = '\n';
	System.out.print("hello" + c5);
	System.out.println("world");
	
	char c6 = '\u0043';
	System.out.println(c6);
	
	//4. �����ͣ� boolean
	//�� ֻ��ȥ����ֵ֮һ��true��false
	//�� �����������жϡ�ѭ���ṹ��ʹ��
	boolean bb1 = true;
	System.out.println(bb1);
	
	boolean isMarried = true;
	if(isMarried){
		System.out.println("��Ͳ��ܲμ�\"����\"party�ˣ�\\n���ź�");
	}else{
		System.out.println("����Զ�̸̸Ů���ѣ�");
	}
	
	
	}
}