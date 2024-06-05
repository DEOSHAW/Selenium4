package javaFeatures;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String args[])
	{
		System.out.println("Enter a Sentence: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String revSt="";
		String[] Word=st.split("\\s");
		for(int i=0;i<Word.length;i++)
		{
			revSt+=reverseString(Word[i])+" ";
		}
		System.out.println(revSt);
		
		
		
		
	}
	
	static String reverseString(String st)
	{
		String revSt="";
		for(int i=st.length()-1;i>=0;i--)
		{
			revSt+=st.charAt(i);
		}
		return revSt;
		
	}

}
