package javaFeatures;

public class FindDuplicateCharacters 
{

	public static void main(String[] args)
	{
		String st="MyNameIsTest";
		char[] cst=st.toLowerCase().toCharArray();
		for(int i=0;i<cst.length;i++)
		{
			int count=1;
			for(int j=i+1;j<cst.length;j++)
			{
				if(cst[i]==cst[j])
				{
					count++;
					cst[j]='&';
				}
			}
			if(count>1&&cst[i]!='&')
			{
				System.out.println(cst[i]);
			}
			
			
		}
		
	}
}
