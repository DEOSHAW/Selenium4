package javaFeatures;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
	    System.out.println("Enter a word: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr+=str.charAt(i);
		}
		
		System.out.println("Reverse of "+str+" is: "+revStr);
		scan.close();
	}
}
