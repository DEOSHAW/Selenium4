package javaFeatures;

public class BubbleSortDemo {
	
	public static void main(String[] args)
	{
		int[] X= {23,12,5,28,5,3,8,2,8,2};
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
		
		for(int x:X)
		{
			System.out.println(x);
		}
	}

}
