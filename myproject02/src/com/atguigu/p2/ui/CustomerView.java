package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	/**
	 * 
	 * @Description 显示客户信息管理软件界面的方法
	 * @author Chris Jin
	 * @date Feb 28, 20227:48:22 PM
	 */
	public void enterMainMenu() {

		boolean isFlag = true;

		while (isFlag) {

			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");

			char menu = CMUtility.readMenuSelection();

			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.println("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	}

	/**
	 * 
	 * @Description 添加客户的操作
	 * @author Chris Jin
	 * @date Feb 28, 20227:48:22 PM
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(30);
		Customer cust = new Customer(name, gender, age, phone, email);

		boolean isAdded = customerList.addCustomer(cust);
		if (isAdded) {
			System.out.println("---------------------添加完成---------------------");
		} else {
			System.out.println("记录已满，添加失败");

		}
	}

	/**
	 * 修改客户的操作
	 * 
	 * @Description
	 * @author Chris Jin
	 * @date Feb 28, 20227:49:41 PM
	 */

	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		Customer cust;
		int sel;

		for (;;) {
			System.out.println("请选择待修改客户编号(-1退出)：");
			sel = CMUtility.readInt();
			if (sel == -1) {
				return;
			}
			cust = customerList.getCustomers(sel);
			if (cust == null) {
				System.out.println("无法找到指定客户");
			} else {
				break;
			}
		}

		// 修改用户信息
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(4, cust.getName());
		System.out.println("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + ")");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() + ")");
		String phone = CMUtility.readString(13, cust.getName());
		System.out.println("邮箱(" + cust.getEmail() + ")");
		String email = CMUtility.readString(30, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);

		boolean isReplace = customerList.replaceCustomer(sel - 1, newCust);
		if (isReplace) {
			System.out.println("---------------------修改完成---------------------");
		} else {
			System.out.println("---------------------修改失败---------------------");
		}
	}

	/**
	 * 
	 * @Description 删除客户的操作
	 * @author Chris Jin
	 * @date Feb 28, 20227:48:37 PM
	 */
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		
		int sel;
		for(;;){
			System.out.println("请选择待删除客户编号(-1退出)：");
			 sel = CMUtility.readInt();
			if(sel == -1){
				return;
			}
			
			Customer cust = customerList.getCustomers(sel - 1);
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
			
		}
		//执行删除操作
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y'){
			customerList.deleteCustomer(sel - 1);
			System.out.println("---------------------删除完成---------------------");
		}
	}

	/**
	 * 
	 * @Description
	 * @author Chris Jin
	 * @date Feb 28, 20227:50:01 PM
	 */
	private void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------");
		if (customerList.getTotal() == 0) {
			System.out.println("没有客户记录！");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
			Customer[] custs = customerList.getAllCustomers();

			Customer cust;
			for (int i = 0; i < custs.length; i++) {
				cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge()
						+ "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
