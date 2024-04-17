package javaFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchInHashmap
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter value to be searched: ");
		Scanner scan=new Scanner(System.in);
		String value=scan.nextLine();
		HashMap<Integer,String> employees=new HashMap<Integer,String>();
		employees.put(4564, "Test demo1");
		employees.put(7897, "Test demo2");
		employees.put(7890, "Test demo3");
		employees.put(8901, "Test demo4");
		String mapValue;
		boolean notFound=true;
		for(Map.Entry<Integer, String> entry:employees.entrySet())
		{
			mapValue=entry.getValue();
		  if(mapValue.equals(value))
		  {
			  System.out.println("Key for "+value+" is "+entry.getKey());
			  notFound=false;
		  }
		 
		}
		if(notFound)
			throw new Exception("Not found");
		
	}

}
