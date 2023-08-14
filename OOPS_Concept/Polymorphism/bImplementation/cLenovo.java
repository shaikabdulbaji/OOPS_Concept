package bImplementation;

public class cLenovo extends SampleAC{
	
	
	public void cut() {		
		System.out.println("Cut Code");
	}

	
	public void keyboard() {
		System.out.println("Keybord Code");
	}
	
	public void copy()
	{
		System.out.println("Lenovo UpdatedCopy Code");
	}
	
	/*
	 * The above copy() method is overrided the copy() method in dSampleAC.
	   This is called Overriding.
	 */
	
	public static void main(String[] args) {
		
		cLenovo lenovo = new cLenovo();
		lenovo.copy();
		
	}
	

}
