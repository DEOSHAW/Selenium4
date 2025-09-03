package javaFeatures;

public class PrintStarPattern 
{
	public static void main(String[] args)
	{
		System.out.println("Forward star pattern");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("Reverse star pattern");
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
