package javaFeatures;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDemo {
	
	public static void main(String args[])
	{
		int[] arr= {3,4,5,3,4,2,12,3,5,5,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		int count=0;
		
		for(int x:arr)
		{
			
		 set.add(x);
		  
		}
		
		for(int a:set)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(a==arr[j])
				{
					count++;
				}
			}
			
			System.out.println(a+" is present "+count+" times");
		}
		
	}

}
