package javaFeatures;

public class Reflection {
	
	void show()
	{
		System.out.println("This is show method");
	}
	
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
		Reflection.class.newInstance().show();
		
	}

}
