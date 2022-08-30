package ca.fscj.service;

import ca.fscj.domain.Architect;
import ca.fscj.domain.Designer;
import ca.fscj.domain.Employee;
import ca.fscj.domain.Equipment;
import ca.fscj.domain.NoteBook;
import ca.fscj.domain.PC;
import ca.fscj.domain.Printer;
import ca.fscj.domain.Programmer;
import ca.fscj.service.Exceptions.TeamException;

import static ca.fscj.service.Data.*;

public class NameListService {

	Employee[] employees;

	public NameListService() {
		int size = EMPLOYEES.length;
		int empType, equipType;
		int id;
		String name;
		int age;
		double salary;
		Equipment equip = null;
		employees = new Employee[size];
		for (int i = 0; i < size; i++) {
			if (EQIPMENTS[i].length > 0) {
				equipType = Integer.parseInt(EQIPMENTS[i][0]);
				switch (equipType) {
				case PC:
					equip = new PC(EQIPMENTS[i][1], EQIPMENTS[i][2]);
					break;
				case NOTEBOOK:
					equip = new NoteBook(EQIPMENTS[i][1], Double.parseDouble(EQIPMENTS[i][2]));
					break;
				case PRINTER:
					equip = new Printer(EQIPMENTS[i][2], EQIPMENTS[i][1]);
					break;
				}
			}
			empType = Integer.parseInt(EMPLOYEES[i][0]);
			id = Integer.parseInt(EMPLOYEES[i][1]);
			name = EMPLOYEES[i][2];
			age = Integer.parseInt(EMPLOYEES[i][3]);
			salary = Double.parseDouble(EMPLOYEES[i][4]);

			switch (empType) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				employees[i] = new Programmer(id, name, age, salary, equip);
				break;
			case DESIGNER:
				employees[i] = new Designer(id, name, age, salary, equip, Double.parseDouble(EMPLOYEES[i][5]));
				break;
			case ARCHITECT:
				employees[i] = new Architect(id, name, age, salary, equip, Double.parseDouble(EMPLOYEES[i][5]),
						Integer.parseInt(EMPLOYEES[i][6]));
				break;
			default:
				employees[i] = new Employee(id, name, age, salary);
			}
		}
	}
	
	public Employee[] getAllEmployees(){
		return this.employees;
	}
	
	public Employee getEmployee(int id) throws TeamException{
		Employee res = null;
		for(int i = 0; i < employees.length; i++){
			if(employees[i].getId() == id){
				res = employees[i];
				break;
			}
		}
		if(res != null){
			return res;
		}
		throw new TeamException("找不到指定的员工");
	}

	public static void main(String[] args) {
		NameListService test = new NameListService();
//		for(int i = 0; i < test.employees.length; i++){
//			System.out.println(test.employees[i].toString());
//		}
		try {
			System.out.println(test.getEmployee(23));
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
