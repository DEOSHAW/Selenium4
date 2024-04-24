package javaFeatures;

import java.util.HashMap;
import java.util.Map;

public class CountOfElement
{
	public static void main(String[] args)
	{
		int[] X= {12,33,24,12,56,78,33,38,12,78,12};
		HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<X.length;i++) 
		{
			count=0;
			for(int j=0;j<X.length;j++)
			{
				if(X[i]==X[j])
				{
					count++;
				}
				
			}
			countMap.put(X[i], count);
			
		}
		for(Map.Entry<Integer, Integer> entry:countMap.entrySet())
		{
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}
	}

}
