/*
For ѭ���ṹ��ʹ��
һ��ѭ���ṹ���ĸ�Ҫ��
�ٳ�ʼ������
��ѭ������ ---> ��boolean����
��ѭ����
�ܵ�������
����forѭ���Ľṹ

for(��;��;��){
	�ۣ�
}

ִ�й��̣��� - �� - �� - �� -  �� - �� - �� - ... - ��

*/

class ForTest{
	public static void main(String[] args){
	
		for(int i = 1; i <= 5;i++){
			System.out.println("Hello World");
		}
		
		//��ϰ��
		int num = 1;
		for(System.out.println('a');num <= 3; System.out.println('c'),num++){
			System.out.println('b');
		}//abcbcbc
		
		//���⣺����100���ڵ�ż�����������ż���ĺ�
		int sum = 0;
		for(int i = 1; i < 101; i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}

}