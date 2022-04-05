package javaFeatures;

import java.util.HashMap;

public class StringCount {
	
	public static void main(String args[])
	{
		String st="My name is Ravi is";
		String[] Words=st.split(" ");
		
		HashMap<String,Integer> wordCount=new HashMap();
		
		for(int i=0;i<Words.length;i++)
		{
			int count=0;
			for(int j=0;j<Words.length;j++)
			{
				if(Words[i].equalsIgnoreCase(Words[j]))
				{
					count++;
					
				}
				
				wordCount.put(Words[i], count);
			}
			
		}
		
		System.out.println(wordCount);
	}

}
