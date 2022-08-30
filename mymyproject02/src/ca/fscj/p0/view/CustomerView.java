package ca.fscj.p0.view;

import ca.fscj.p0.service.CustomerList;
import ca.fscj.p0.util.CMUtility;

public class CustomerView {

	private CustomerList list;

	public CustomerView(int capacity) {
		this.list = new CustomerList(capacity);
	}

	private void menu() {
		boolean isEnd = false;
		for (;;) {
			if(isEnd) break;
			System.out.println("-----------------客户信息管理软件-----------------\n");
			System.out.println("1 添 加 客 户");
			System.out.println("2 修 改 客 户");
			System.out.println("3 删 除 客 户");
			System.out.println("4 客 户 列 表");
			System.out.println("5 退       出");

			System.out.print("请选择(1-5)：");
			char sel = CMUtility.readChar();
			switch (sel) {
			case '1':
				addCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listCustomers();
				break;
			case '5':
				System.out.print("确认是否退出(Y/N)：");
				if(CMUtility.readConfirmSelection() == 'Y') isEnd = true;
			}
		}
	}

	private void listCustomers() {
		// TODO Auto-generated method stub
		
	}

	private void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	private void modifyCustomer() {
		// TODO Auto-generated method stub
		
	}

	private void addCustomer() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerView view = new CustomerView(10);
		view.menu();

	}

}
