package bImplementation;

/*
 * Method overloading is same method name but different parameters(type of parameters
   (or) no.of parameters (or) order of parameters).
   
 * Where we used method overloading is 
   eg: System.out.print			
   while typing this we get so many methods these are the examples of method overloading
 */


public class aCaluculations {
	
	public void add(int a, int b)
	{
		
	}
	
	/*
	 * Some times in interview they will confuse us like riversing the a and b and
	   they will ask we achive method overloading or not like that.
	 */
	
	public void add(int a, int b, int c)
	{
		
	}
	
	public static void main(String[] args) {
		
		aCaluculations cal = new aCaluculations();
		cal.add(2, 3);      //If we want two parameters choose this one.
		cal.add(2, 3, 4);	//If we want three parameters choose this one.
	}
	
	

}
