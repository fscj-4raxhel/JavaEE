/*
String���ͱ�����ʹ��
1. String�������������������ͣ�����Ϊ���ַ���
2. ����String���ͱ���ʱ��ʹ��һ��""
3. String���Ժ�8�ֻ����������ͱ��������㣬������ֻ������������+
4. ����Ķ�����Ȼ��String����


*/
class StringTest{
	public static void main(String[] args){
		String s1 = "Hello World";
		
		System.out.println(s1);
		
		String s2 = "a";
		String s3 = "";
		
		//char c = '';���벻ͨ��
		
		//**********************
		int number = 1001;
		String numberStr = "ѧ�ţ�";
		String info = numberStr +number;
		boolean b1 = true;
		String info1 = info + b1;//+���Ӳ���
		System.out.println(info1);
		
		//**********************
		//��ϰ1
		char c = 'a';//97 'A': 65
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);//107hello
		System.out.println(c + str + num);//ahello10
		System.out.println(c + (num + str));//a10hello
		System.out.println((c + num) + str);//107hello
		System.out.println(str + num + c);//hello10a
		
		//��ϰ2
		//* *
		System.out.println("*	*");
		System.out.println('*' + '\t' + '*');
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ('\t' + "*"));
		
		//**********************
		
		//String str1 = 123; ���벻ͨ��
		String str1 = 123 + "";
		System.out.println(str1);
		
		//int num1 = str1;
		//int num1 = (int)str1;
		
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
	}
}