package javaFeatures;

import java.util.Scanner;

public class CountVowelsAndConsonants
{
   public static void main(String[] args)
   {
	   System.out.println("Enter a word: ");
	   Scanner scan=new Scanner(System.in);
	   String st=scan.nextLine();
	   int totalLength=st.length();
	   int vCount=0, cCount=0;
	   
	   for(int i=0;i<totalLength;i++)
	   {
		   if(st.charAt(i)=='A'|st.charAt(i)=='E'|st.charAt(i)=='I'|st.charAt(i)=='O'|st.charAt(i)=='U'|st.charAt(i)=='a'|st.charAt(i)=='e'|st.charAt(i)=='i'|st.charAt(i)=='o'|st.charAt(i)=='u')
		   {
		     vCount++;
		   }
	   }
	   cCount=totalLength-vCount;
	   System.out.println("Vowels: "+vCount+" "+"Consonants: "+cCount);
	   scan.close();
   }
}
