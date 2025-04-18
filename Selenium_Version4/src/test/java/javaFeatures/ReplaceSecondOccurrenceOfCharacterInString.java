package javaFeatures;


public class ReplaceSecondOccurrenceOfCharacterInString 
{
	
	public static void main(String[] args)
	{
		//Replace second 'o' with $
		String st="tomorrow";
		char[] cst=st.toCharArray();
		int count=0;
		for(int i=0;i<cst.length;i++)
		{
			if(cst[i]=='o')
			{
				count++;
			}
			if(count==2)
			{
				cst[i]='$';
				count=0;
			}
		}
		
		System.out.println(new String(cst));
	}

}
