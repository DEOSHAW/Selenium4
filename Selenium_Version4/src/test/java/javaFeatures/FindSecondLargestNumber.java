package javaFeatures;

public class FindSecondLargestNumber 
{
	public static void main(String[] args)
	{
		int[] X= {85,45,35,77,12,8,7,36};
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
		System.out.println();
		
		System.out.println("Second largest number is: "+X[X.length-2]);
	}

}
