
class FamilyAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
		//��ʼ���
		int balance = 10000;
		
		int amount;
		String info;
		while(isFlag){
			
			System.out.println("-----------------��ͥ��֧�������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��");
			System.out.println();
			System.out.print("                   ��ѡ��(1-4)��");
			
			char selection = Utility.readMenuSelection();
			
			switch(selection){
			
			case '1':
				System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
				System.out.print("���������");
				amount = Utility.readNumber();
				System.out.print("��������˵����");
				info = Utility.readString();
				
				balance += amount;
				//����details
				details += "����\t" + balance + "\t\t" + amount + "\t\t" + info +"\n";
				
				System.out.println("---------------------�Ǽ����---------------------");
				break;
			case '3':
				System.out.println("����֧����");
				amount = Utility.readNumber();
				System.out.print("��������˵����");
				info = Utility.readString();
				
				if(balance < amount){
					System.out.println("���㣬֧��ʧ��");
				}else{
					balance -= amount;
					//����details
					details += "����\t" + balance + "\t\t" + amount + "\t\t" + info +"\n";
				
				System.out.println("---------------------�Ǽ����---------------------");
				}
				break;
			case '4':
				//System.out.println("4.��    ��");
				System.out.print("ȷ���Ƿ��˳�(Y/N)��");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
				break;
			}
		}
	}
}