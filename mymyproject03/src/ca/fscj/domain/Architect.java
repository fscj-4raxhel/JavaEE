package ca.fscj.domain;

public class Architect extends Designer {

	private int stock;

	public Architect(){
		
	}
	
	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}

	public Architect(double bonus, int stock) {
		super(bonus);
		this.stock = stock;
	}
	
	
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String getMemberInfo(){
		return getTeamDetails() + "\t架构师\t"+getBonus() + "\t" + getStock();
	}
	
	@Override
	public String toString() {
		return getInfo() + "\t架构师\t" + getStatus().toString() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}
}
