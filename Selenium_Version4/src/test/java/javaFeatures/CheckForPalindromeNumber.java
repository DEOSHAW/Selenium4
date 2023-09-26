package javaFeatures;

import java.util.Scanner;

public class CheckForPalindromeNumber {
	
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner scan=new Scanner(System.in);
		int oNum=scan.nextInt();
		int num=oNum;
		int rem=0;
		int revNum=0;
		
		while(num>0)
		{
			rem=num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		
		System.out.println(revNum);
	}

}
