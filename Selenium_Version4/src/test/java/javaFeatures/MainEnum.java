package javaFeatures;

enum Locators
{
	
	WEB_XPATH("web xpath","//*[text()='Hello']"),
	SAP_XPATH("sap xpath","//*[text()='Hi']"),
	ATG_XPATH("atg xpath","//*[text()='How are you']");
	
	String s1,s2;
	
	Locators(String st1,String st2)
	{
		s1=st1;
		s2=st2;
		
	}
	
	public String getValue()
	{
		return s2;
		
	}
	public String getAttribute()
	{
		return s1;
		
	}
	
	
	
}

public class MainEnum {

	public static void main(String[] args) {
		
     System.out.println(Locators.SAP_XPATH.getValue());
     System.out.println(Locators.SAP_XPATH.getAttribute());
	}

}
