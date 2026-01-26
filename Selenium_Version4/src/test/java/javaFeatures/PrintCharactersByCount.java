package javaFeatures;

public class PrintCharactersByCount 
{

	public static void main(String[] args) 
	{
		String st="a2b3c4d5";
		for(int i=0;i<st.length();i++)
		{
			if(Character.isAlphabetic(st.charAt(i)))
			{
				System.out.print(st.charAt(i));
			}
			else
			{
				int count=Character.getNumericValue(st.charAt(i));
				for(int j=1;j<count;j++)
				{
					System.out.print(st.charAt(i-1));
				}
			}
			
		}
	}
}
