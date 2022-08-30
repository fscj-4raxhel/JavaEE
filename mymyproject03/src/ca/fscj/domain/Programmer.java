package ca.fscj.domain;

import static ca.fscj.domain.Status.*;

public class Programmer extends Employee {
	private int memberID;
	private Status status = FREE;
	private Equipment equipment;
	
	

	public Programmer(){
		
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.memberID = memberID;
		this.status = status;
		this.equipment = equipment;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	public String getTeamDetails(){
		return getMemberID() + "/" + getInfo();
	}
	
	public String getMemberInfo(){
		return getTeamDetails() + "\t程序员";
	}
	
	public String toString(){
		return this.getInfo() + "\t程序员\t" + status.toString() + "\t\t\t" + this.getEquipment().getDescription();
	}

}
