package javaFeatures;

public class MoveAllZerosInArrayToEnd 
{
	public static void main(String[] args)
	{
		int[] X= {12,0,3,45,7,8,4,0,3};
		int[] Y=new int[X.length];
		int j=0;
		for(int i=0;i<X.length;i++)
		{
			if(X[i]!=0)
			{
				Y[j]=X[i];
				j++;
			}
		}
		
		for(int y:Y)
			System.out.print(y+" ");
	}

}
