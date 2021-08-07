package javaFeatures;

public class LambdaImplementation {
	
	static int x=3;
	Calculator calc=(a,b)-> {
		return a+b+x;
		};
		
		
		void Show()
		{
			System.out.println("Sum is: "+calc.add(4, 5));
		}
	public static void main(String args[]) throws InstantiationException, IllegalAccessException
	{
		
		LambdaImplementation.class.newInstance().Show();
		
		
	}
	
	

}
