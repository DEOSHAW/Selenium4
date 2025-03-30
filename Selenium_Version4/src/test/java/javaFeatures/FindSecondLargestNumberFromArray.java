package javaFeatures;

import java.util.LinkedHashSet;

public class FindSecondLargestNumberFromArray 
{
	public static void main(String[] args)
	{
		int[] X= {12,3,4,25,11,77,55};
		int temp=0;
		for(int i=0;i<X.length;i++)
		{
			temp=0;
			for(int j=i+1;j<X.length;j++)
			{
				if(X[i]>X[j])
				{
					temp=X[i];
					X[i]=X[j];
					X[j]=temp;
				}
				
			}
		 }
			LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
			
			for(int x:X)
			{
				ls.add(x);
			}
			
			for(Object x:ls.toArray())
			{
				System.out.print(x+" ");
			}
		}
				
	}

