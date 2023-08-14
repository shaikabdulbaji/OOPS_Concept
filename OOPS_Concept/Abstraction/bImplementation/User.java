package bImplementation;

public class User {

	public static void main(String[] args) {

		Laptop lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		
	}
	
	/*
	 * Abstraction is a process of hiding the implementation details and showing 
	   only functionality to the user. 
	   
	 * First we put the object as like below 
	   Lenovo lenovo = new Lenovo();
	   and click on copy and press "fn+f3" then it will redirect to "implementation",
	   then it was not achieving Abstraction.
	   
	 * Second we put the object as like below 
	   SampleAC lenovo = new Lenovo();
	   and click on copy and press "fn+f3" then it will redirect to "implementation",
	   then it was not achieving Abstraction.
	   
	 * Third we put the object as like below 
	   Laptop lenovo = new Lenovo();
	   and click on copy and press "fn+f3" then it will redirect to "Functionality",
	    then it was achieving Abstraction.
	    
	 * By using abstract classes we can't achieve 100% abstraction, to achieve 100% 
	   abstraction we use interfaces.
	 */

}
