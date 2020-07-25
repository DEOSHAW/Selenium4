package javaFeatures;

public class ExceptionDemo {
	
	static int x,y;

	public static void main(String[] args) {
		final int z=5;
		// TODO Auto-generated method stub
		
		
		Divide();
		

	}
	
	
	static void Divide()
	{
		try
		{
		x=5/0;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
		}
		
		y=4;
		System.out.println("value is: "+y);
		System.out.println("value is: "+Demo.x);
	}

}
