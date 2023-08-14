package Example;

public class Student {
	
	private int rollNumber;
	private String Name;
	private boolean isAttendance;
	
	/*
	 * If we declare variables with "private" keyword then we want to retrive 
	   data from those variables, then we create "getters and setters" methods.
	   
	 * if we place variables as public then we create methods for that variables and intialize 
	   some value and create main method and we can directly call that variables by creating 
	   object of that class.
	 * if we place variables as private then we create "getters and setters" methods and return and
	   create main method and while calling time we can initialize the values by creating object of 
	   that class.
	 */
	
	
	public int getRollNumber() {
		System.out.println("Teacher get RollNumber");
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		System.out.println("Teacher get Name");
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean getisAttendance() {
		System.out.println("Teacher get Attendence");
		return isAttendance;
	}
	public void setAttendance(boolean isAttendance) {
		this.isAttendance = isAttendance;
	}

}
