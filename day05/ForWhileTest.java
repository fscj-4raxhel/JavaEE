/*
��Ŀ��
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

*/

import java.util.Scanner;

class ForWhileTest{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int pCount = 0;
	int nCount = 0;
	
	while(true){
	
		in number = scan.nextInt();
		
		if(number > 0){
			pCount++;
		}else if(number < 0){
			nCount++;
		}else{
			break;
		}
	}
	 System.out.println("�����ĸ���Ϊ��" + pCount);
	 System.out.println("�����ĸ���Ϊ��" + nCount);
	
	}
}