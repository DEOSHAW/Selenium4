package javaFeatures;

import java.util.Scanner;

public class ReverseStringDemo {
	
	public static void main(String[] args)
	{
		System.out.println("Enter a String: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		String revSt="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			revSt+=st.charAt(i);
		}
		
		System.out.println("Reversed string is: "+revSt);
	}

}
