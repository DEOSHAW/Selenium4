package javaFeatures;

import java.util.LinkedHashSet;

public class DuplicateElementInArray {
	
	public static void main(String args[])
	{
		int[] X= {12,3,12,5,6,7,5};
		
		LinkedHashSet<Integer> lSet=new LinkedHashSet<>();
		for(int x:X)
		{
			if(!lSet.add(x))
			{
				System.out.println(x+" is duplicate");
			}
			
		}
	}

}
