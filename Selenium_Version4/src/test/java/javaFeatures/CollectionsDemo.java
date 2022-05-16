package javaFeatures;

import java.util.HashMap;
import java.util.Set;

public class CollectionsDemo {
	
	public static void main(String args[])
	{
		
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("EmpName", "Deo Prasad shaw");
		map.put("EmpAge", "30");
		map.put(null, "31");

		Set<String> keys=map.keySet();
		System.out.println(keys);
		for(String key:keys)
		{
			System.out.println(map.get(key));
		}
		
		
		
		
		
		
	}

}
