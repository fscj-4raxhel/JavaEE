package ca.fscj.domain;

public class Designer extends Programmer {
	private double bonus;

	public Designer(){
		
	}
	
	public Designer(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
		super(id, name, age, salary, equipment);
		this.bonus = bonus;
	}
	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String getMemberInfo(){
		return getTeamDetails() + "\t设计师\t"+getBonus();
	}

	@Override
	public String toString() {
		return getInfo() + "\t设计师\t" + getStatus().toString() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
	}
	
	
	
	


}
