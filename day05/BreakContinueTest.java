/*
break��continue�ؼ��ֵ�ʹ��
			ʹ�÷�Χ		ѭ���е�����	��ͬ��
break:		switch-case
			ѭ���ṹ		������ǰѭ��	�ؼ����治����ִ�����

continue:	ѭ���ṹ		��������ѭ��	�ؼ����治����ִ�����

*/

class BreakContinueTest{
	public static void main(String[] args){
		
		for(int i = 1; i <= 10; i++){
		
			if(i % 4 == 0){
				//break; 123
				continue;//123567910
			}
			System.out.println(i);
		}
		
		//****************************
		label: for(int i = 1; i <= 10; i++){
		
			if(i % 4 == 0){
				//break; 123
				//continue;
				
				//break lable;//����ָ����ʶ��һ��ѭ���ṹ
				continue label;//����ָ����ʶ��һ��ѭ���ṹ����ѭ��
			}
			System.out.println(i);
		}
	
	
	}

}