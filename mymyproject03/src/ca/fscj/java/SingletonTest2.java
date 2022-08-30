package ca.fscj.java;

public class SingletonTest2 {
	public static void main(String[] args) {
		
		
	Pool p1 = Pool.getInstance();
	
	Pool p2 = Pool.getInstance();
	
	System.out.println(p1==p2);
	
	}
}

class House{
	
	private static House instance = null;
	
	private House(){
		
	}
	
	public static House getInstance(){
		if(instance == null){
			instance = new House();
		}
		return instance;
	}
	
}