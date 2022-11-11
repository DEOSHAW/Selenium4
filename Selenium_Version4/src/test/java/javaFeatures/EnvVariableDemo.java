package javaFeatures;

import java.util.Map;
import java.util.Set;


public class EnvVariableDemo {
	
	
	public static void main(String args[])
	{
		//Map<String,String> envVariables=System.getenv();
		//Set<String> setKey=envVariables.keySet();
		System.out.println("Variable names are: "+System.getenv("PATH"));
		
	}

}
