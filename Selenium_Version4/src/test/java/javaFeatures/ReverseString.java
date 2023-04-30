package javaFeatures;

public class ReverseString {

	public static void main(String[] args) {
		//Input : How are you ?
		//Output : woH era uoy ?
		
		String st="How are you ?";
		String[] str=st.split("\\s");
		
		String revStr="";
		
		for(String s:str)
		{
			revStr+=reverseString(s)+" ";
		}
		
		System.out.println(revStr);

	}
	
	static String reverseString(String str)
	{
		
		String revStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr+=str.charAt(i);
		}
		
		return revStr;
	}

}
