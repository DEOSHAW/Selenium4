package javaFeatures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashTableDemo {
	
	
	public static void main(String args[])
	{
		HashMap<Integer,String> table=new HashMap<Integer,String>();
		table.put(102, "Shaw");
		table.put(100, "Deo");
		table.put(101, "Prasad");
		
		for(Map.Entry m:table.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		Set<Integer> keys=table.keySet();
		for(int k:keys)
		{
			System.out.println(k+" "+table.get(k));
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		TreeMap<Integer,String> tree=new TreeMap<Integer,String>(table);
		for(Map.Entry m:table.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
