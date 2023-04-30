package javaFeatures;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) 
	{
		//Anagram
		
		String st1="Madam";
		String st2="Mamdab";
		
		char[] cSt1=st1.toCharArray();
		char[] cSt2=st2.toCharArray();
		
		Arrays.sort(cSt1);
		Arrays.sort(cSt2);
		
		if(Arrays.equals(cSt1, cSt2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		

	}

}
