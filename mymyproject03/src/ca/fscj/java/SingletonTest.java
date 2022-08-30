package ca.fscj.java;

public class SingletonTest {
	
	public static void main(String[] args) {
		
	
	Pool p1 = Pool.getInstance();
	
	Pool p2 = Pool.getInstance();
	
	System.out.println(p1==p2);
	
	}
	
	
}

class Pool{
	
	private static Pool instance;
	
	private Pool(){
		instance = new Pool();
	}
	
	public static Pool getInstance(){
		return instance;
	} 
}
