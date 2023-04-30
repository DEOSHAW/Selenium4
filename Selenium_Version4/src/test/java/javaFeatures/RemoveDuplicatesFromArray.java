package javaFeatures;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args)
	{
		int[] X= {34,12,3,5,6,12,7,3,34};
		
		//Remove duplicates from Array
		LinkedHashSet<Integer> lSet=new LinkedHashSet<Integer>();
		for(int x:X)
		{
			lSet.add(x);
		}
		
		
		
		
		for(Object a:lSet.toArray())
		System.out.print(a+" ");
		
	}

}
