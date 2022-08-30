package ca.fscj.domain;

public class Status {
	public static final Status FREE = new Status(0);
	public static final Status BUSY  = new Status(1);
	public static final Status VOCATION  = new Status(2);
	
	private int status;
	
	

	public Status() {
		super();
	}



	private Status(int status) {
		this.status = status;
	}
	
	public String toString(){
		if(this == FREE){
			return "FREE";
		}else if(this == BUSY){
			return "BUSY";
		}else{
			return "VOCATION";
		}
	}
	
}
