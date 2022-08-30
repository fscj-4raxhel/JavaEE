package ca.fscj.view;

import ca.fscj.domain.*;
import ca.fscj.service.NameListService;
import ca.fscj.service.TeamService;
import ca.fscj.service.Exceptions.TeamException;

public class TeamView {

	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	public void enterMainMenu() {
		boolean end = false;
		char selection = 0;
		while (!end) {
			
			if(selection != '1'){				
				listAllEmployees();
			}
			selection = TSUtility.readMenuSelection();
			switch (selection) {
			case '1':
				getTeam();
				System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("确认退出吗?[Y|N]");
				char confirm = TSUtility.readConfirmSelection();
				if (confirm == 'Y') {
					end = true;
				}
			}
		}
		System.out.println("退出成功!");
	}

	private void listAllEmployees() {
		Employee[] emps = listSvc.getAllEmployees();

		if (emps.length == 0) {
			System.out.println("没有职员!");
			return;
		}

		System.out.println("-------------------------------开发团队调度软件--------------------------------");
		System.out.println();
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		for (Employee e : emps) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------------------------------------");
		System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
	}

	private void getTeam() {
		System.out.println("--------------------团队成员列表---------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if (team == null) {
			System.out.println("开发团队目前没有成员！");
			return;
		}
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		for (Programmer p : team) {
			System.out.println(p.getMemberInfo());
		}

		System.out.println("-----------------------------------------------------");
	}

	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try {
			Employee e = listSvc.getEmployee(id);
			teamSvc.addMember(e);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("添加失败!: " + e.getMessage());
		}
	}

	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		System.out.print("请输入要添加的员工TID：");
		int tid = TSUtility.readInt();
		try {
			teamSvc.removeMember(tid);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("删除失败!: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamView view = new TeamView();
		view.enterMainMenu();
	}

}
