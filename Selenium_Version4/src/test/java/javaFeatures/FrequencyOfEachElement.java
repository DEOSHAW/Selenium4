package javaFeatures;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
	
	
	public static void main(String args[])
	{
		int[] X= {12,3,4,5,7,6,7,12,3,8,3,9,20,9};
		int count=0;
		HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
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
		
		
		for(Map.Entry<Integer,Integer> entry:countMap.entrySet())
		{
			System.out.println(entry.getKey()+"==>"+entry.getValue());
		}
	}

}
