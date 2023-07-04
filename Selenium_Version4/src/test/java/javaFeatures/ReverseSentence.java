package javaFeatures;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String args[])
	{
		System.out.println("Enter a Sentence");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		
		String[] wd=st.split("\\s");
		String[] rwd=new String[wd.length];
		
		int i=0;
		for(int j=wd.length-1;j>=0;j--)
		{
			rwd[i]=wd[j];
			i++;
		}
		
		for(String word:rwd)
		{
			System.out.print(word+" ");
		}
	}

}
