package javaFeatures;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterOccurrences
{
	public static void main(String[] args)
	{
		System.out.println("Enter a word: ");
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine().replaceAll("\\s+", "");
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<st.length();i++)
		{
			if(lh.get(st.charAt(i))==null)
			{
				lh.put(st.charAt(i), 1);
			}
			else
			{
				lh.put(st.charAt(i), lh.get(st.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: lh.entrySet())
		{
			System.out.println(entry.getKey()+"<======>"+entry.getValue());
		}
		
	}

}
