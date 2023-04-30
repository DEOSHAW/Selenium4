package javaFeatures;

public class SortingArray
{
	
	
	public static void main(String args[])
	{
		int temp;
		int[] X= {22,13,55,78,8,2,56};
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
		
		for(int x:X)
		{
			System.out.println(x);
		}
	}

}
