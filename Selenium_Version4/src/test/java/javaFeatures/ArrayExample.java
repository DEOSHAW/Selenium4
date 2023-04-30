package javaFeatures;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		int[] X= {3,12,34,56,77};
		for(int i=0;i<X.length;i++)
		{
			if(X[i]%2==0)
			{
				System.out.println("Even: "+X[i]);
			}
			else
			{
				System.out.println("Odd: "+X[i]);
			}
		}

	}

}
