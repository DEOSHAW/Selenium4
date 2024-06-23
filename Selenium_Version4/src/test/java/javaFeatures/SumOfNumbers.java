package javaFeatures;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			sum+=i;
			
		}
		
		System.out.println("Sum of numbers is: "+sum);
		
		
	}

}
