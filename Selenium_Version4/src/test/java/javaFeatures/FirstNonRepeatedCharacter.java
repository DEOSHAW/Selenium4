package javaFeatures;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) 
	{
		System.out.println("Enter a word: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		
		LinkedHashMap<Character, Integer> countMap=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<st.length();i++)
		{
			if(countMap.get(st.charAt(i))==null)
			{
				countMap.put(st.charAt(i), 1);
			}
			else
			{
				countMap.put(st.charAt(i), countMap.get(st.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:countMap.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First non repeated character is: "+entry.getKey());
				break;
			}
		}
	}
}
