/*
This class demonstrates variables in a nutshell.

1. Variable declaration in Java： <type> <name> = <value>；

2. Note：
	① Variables must be declared before being accessed.
	② Variables are accessible within their scopes (embracing {}).
	③ Within a scope, a pair of matching {}, no two variables have the same name.

*/
class VariableTest{
	public static void main(String[] args){
		//Variable definition = variable declaration + initialization
		int myAge = 10;
		//Accessing variable 
		System.out.println(myAge);
		
		//Complier error：myNumber is not defined.
		//System.out.println(myNumber);
		
		//Variable declaration
		int myNumber;
		
		//Complier error：myNumber is not initialized.
		//System.out.println(myNumber);
		//变量的赋值
		myNumber = 1001;
		
		//Complier myClass is not in this scope.
		//System.out.println(myClass);
		
		//Complier myNumber is already declared
		//int myNumber;
		
	}
	
	public void method(){
		int myClass = 1;
	}
}