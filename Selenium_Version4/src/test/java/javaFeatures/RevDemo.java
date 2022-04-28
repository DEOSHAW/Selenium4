package javaFeatures;

public class RevDemo {
	
	public static void main(String args[])
	{
		String st="Ram Prasad Rohit Praveen";

		String st1[]=st.split("\\s");
		StringBuilder reversedString=new StringBuilder();
		
		
		for(int i=0;i<st1.length;i++)
		{
			System.out.println(st1[i]);
			
			reversedString.append(reverse(st1[i]));
			reversedString.append(" ");
		}
		
		System.out.println(reversedString);
	}
	
	
	static String reverse(String st)
	{
		
		char[] word=st.toCharArray();
		char[] word_rev=new char[word.length];
		
		
			int j=word.length-1;
			for(int i=0;i<word.length;i++)
			{
				word_rev[i]=word[j];
				j--;
			}
			
			String revSt=new String(word_rev);
		
		return revSt;
		
		
		
	}

}
