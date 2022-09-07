
class FamilyAccount{
	public static void main(String[] args){
		boolean isFlag = true;
		String details = "收支\t账户金额\t收支金额\t说    明\n";
		//初始金额
		int balance = 10000;
		
		int amount;
		String info;
		while(isFlag){
			
			System.out.println("-----------------家庭收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出");
			System.out.println();
			System.out.print("                   请选择(1-4)：");
			
			char selection = Utility.readMenuSelection();
			
			switch(selection){
			
			case '1':
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
				System.out.print("本次收入金额：");
				amount = Utility.readNumber();
				System.out.print("本次收入说明：");
				info = Utility.readString();
				
				balance += amount;
				//处理details
				details += "收入\t" + balance + "\t\t" + amount + "\t\t" + info +"\n";
				
				System.out.println("---------------------登记完成---------------------");
				break;
			case '3':
				System.out.println("本次支出金额：");
				amount = Utility.readNumber();
				System.out.print("本次收入说明：");
				info = Utility.readString();
				
				if(balance < amount){
					System.out.println("余额不足，支付失败");
				}else{
					balance -= amount;
					//处理details
					details += "收入\t" + balance + "\t\t" + amount + "\t\t" + info +"\n";
				
				System.out.println("---------------------登记完成---------------------");
				}
				break;
			case '4':
				//System.out.println("4.退    出");
				System.out.print("确认是否退出(Y/N)：");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
				break;
			}
		}
	}
}