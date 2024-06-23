package javaFeatures;

public class SortingArray
{
	
	public static void main(String[] args)
	{
		int[] X= {44,55,30,25,18,12,8,6,4,1,2};
		int temp=0;
		for(int i=0;i<X.length;i++)
		{
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
		for(int x:X)
		{
			System.out.print(x+" ");
		}
	}
}
