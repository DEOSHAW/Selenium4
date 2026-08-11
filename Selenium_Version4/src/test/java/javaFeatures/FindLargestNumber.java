package javaFeatures;

public class FindLargestNumber
{
	public static void main(String[] args)
	{
		int[] X= {12,35,8,45,58,24,98,23,1};
		int max=0;
		max=X[0];
		for(int i=0;i<X.length;i++)
		{
			if(X[i]>max)
			{
				max=X[i];
			}
		}
		System.out.println("Largest number is: "+max);
	}

}
