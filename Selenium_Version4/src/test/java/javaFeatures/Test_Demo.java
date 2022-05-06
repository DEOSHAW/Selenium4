package javaFeatures;

import java.util.HashMap;

public class Test_Demo {

	public static void main(String[] args) {
		String st="AAAABBBCCAA";
		boolean flag=false;
		char[] chars=st.toCharArray();
		char ch=chars[0];
		int count=0;
		for(int i=0;i<chars.length;i++)
		{
			if(flag)
			{
				System.out.println(ch+"==>"+count);
				ch=chars[i-1];
				count=1;
				flag=false;
			}
			if(ch==chars[i])
			{
				count++;
			}
			else
			{
				
				flag=true;
			}
			
			
		}
		System.out.println(ch+"==>"+count);
		
		
		
		
		//Output a^4 b^3 c^2 a^2

	}

}
