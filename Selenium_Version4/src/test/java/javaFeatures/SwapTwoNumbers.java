package javaFeatures;

import java.util.Scanner;

public class SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		System.out.println("Enter First number: ");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter Second number: ");
		int b=scan.nextInt();
		System.out.println("a= "+a+" "+"b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a= "+a+" "+"b= "+b);
		scan.close();
	}

}
