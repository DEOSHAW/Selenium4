package javaFeatures;

public class Palindrome {
	
	public static void main(String args[])
	{
		String str="RADAR";
		int length=str.length();
		char[] charArray=new char[length];
		System.out.println(length);
		int j=0;
		for(int i=(length-1);i>=0;i--)
		{
			char ch=str.charAt(i);
			System.out.println(ch);
			charArray[j]=ch;
			j++;
			
		}
		
		String str1=new String(charArray);
		if(str.equals(str1))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
		
	}

}
