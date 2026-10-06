package javaFeatures;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters
{
	public static void main(String[] args)
	{
		System.out.println("Enter a word: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.next();
		LinkedHashSet<Character> charSet=new LinkedHashSet<Character>();
		
		for(int i=0;i<st.length();i++)
		{
			charSet.add(st.charAt(i));
		}
		
		String updatedStr="";
		
		for(Character ch:charSet)
		{
			updatedStr+=ch;
		}
		
		System.out.println(st+" is updated as: "+updatedStr);
	}

}
