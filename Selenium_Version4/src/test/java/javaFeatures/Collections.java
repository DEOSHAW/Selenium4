package javaFeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
	
	public static void main(String args[])
	{
		Map<String,String> Names=new HashMap<String,String>();
		Names.put("firstName","Deo");
		Names.put("middleName","Prasad");
		Names.put("lastName","Shaw");
		
		Set<String> Keys=Names.keySet();
		for(String s:Keys)
		{
			System.out.println(Names.get(s));
		}
		
		List<String> names=new ArrayList<String>();
		names.add("Deo");
		names.add("Prasad");
		names.add("Shaw");
		
		
		Iterator itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(4);
		al.add(45);
		al.add(7);
		
		
		java.util.Collections.sort(al);
		
		System.out.println(al);
		
		
		
		
	}

}
