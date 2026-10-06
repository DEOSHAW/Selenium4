package javaFeatures;

import java.util.Scanner;

public class CheckPalindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter a word: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String revSt="";
		for(int i=st.length()-1;i>=0;i--)
		{
			revSt+=st.charAt(i);
		}
		
		if(st.equalsIgnoreCase(revSt))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
