package Example;

public class Teacher {
	
	public static void main(String[] args) {
	
		Student s =  new Student();
		s.setRollNumber(101);
		s.setAttendance(true);
		s.setName("Abdul");
		
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		System.out.println(s.getisAttendance());
	}

}
