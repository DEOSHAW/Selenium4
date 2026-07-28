package javaFeatures;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args)
	{
		//I love Java=>Java love I
		System.out.println("Enter a Sentence: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		System.out.println(st);
		String[] wordArr=st.split("\\s");
		String revSt="";
		for(int i=wordArr.length-1;i>=0;i--)
		{
			revSt=revSt+wordArr[i]+" ";
		}
		
		System.out.println(revSt);
		scan.close();
	}
}
