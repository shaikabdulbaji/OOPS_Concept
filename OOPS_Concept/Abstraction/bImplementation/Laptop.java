package bImplementation;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	public default void security()
	{
		commonCode();
		System.out.println("Laptop Security Code");
	}

	public default void audio()
	{
		commonCode();
		System.out.println("Laptop Audio Code");
	}
	
	public static void commonCode()
	{
		System.out.println("Commoncode");
	}
}
