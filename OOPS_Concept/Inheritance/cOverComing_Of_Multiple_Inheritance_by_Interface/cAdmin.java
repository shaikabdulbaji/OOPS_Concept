package cOverComing_Of_Multiple_Inheritance_by_Interface;

public interface cAdmin extends aGuest, bDeveloper{
	
	public void manage();
	
	/*
	 * Multiple inheritance is not supported by java with classes
	 * Multiple inheritance is supported by java with interfaces
	 
	 
	 * In interfaces there is no implementation but i want to implement that methods
	   simply create another class and by using "implements" keyword we implement there
	   unimplemented methods.
	 */

}
