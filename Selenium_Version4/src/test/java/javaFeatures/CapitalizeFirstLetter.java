package javaFeatures;

import java.util.Scanner;

public class CapitalizeFirstLetter
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter a Sentence: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String[] Word=st.split("\\s");
		String finalWord = "";
		for(String word:Word)
		{
			finalWord+=word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ";
			
		}
		
		System.out.println(finalWord);
		
	}

}
