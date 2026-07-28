package javaFeatures;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		System.out.println("Enter count of numbers: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print(num1+" "+num2+" ");
		for(int i=0;i<n-2;i++)
		{
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
		scan.close();
	}
}
