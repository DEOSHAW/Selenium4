package javaFeatures;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(22);
		ls.add(25);
		ls.add(35);
		ls.add(45);
		ls.add(12);
		
		System.out.println(ls.contains(35));
		Iterator<Integer> itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
