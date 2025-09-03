package javaFeatures;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Sentence: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String capitalizedSt = "";
		String[] words=st.split("\\s");
		for(String word:words)
		{
			word=word.substring(0,1).toUpperCase()+word.substring(1,word.length());
			capitalizedSt+=word+" ";
		}
		System.out.println(capitalizedSt);
	}

}
