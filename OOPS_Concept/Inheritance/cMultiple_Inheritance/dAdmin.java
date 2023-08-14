package cMultiple_Inheritance;

public class dAdmin extends cDeveloper{
	
	/*
	 * public class dAdmin extends cDeveloper,bGuest
	 * By giving the above line we get the error that error is  java not allow multiple inheritance,
	   if in worst case java will allow then also it was not applicable why because we can create 
	   object for dAdmin like,
	   
	   dAdmin admin = new dAdmin();
	   admin.read();
	   
	   while calling admin.read java will get confusion from which class i want to call this method
	   wheather from bGuest or cDeveloper class.
	   
	   That's why java will not allow multiple inheritance concept.
	 */
	
	
	//Adding or Deleting the Product/Application
	public void manage()
	{
		System.out.println("Manage Code");
	}

}
