package javaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoArrayList 
{
	public static void main(String[] args)
	{
		List<Object> a1=new ArrayList<Object>( Arrays.asList('a','b','c'));
		List<Object> a2=new ArrayList<Object>( Arrays.asList(1,2,3));
		List<Object> a3=new ArrayList<>();
		System.out.println(a1);
		System.out.println(a2);
		for(int i=0;i<a1.size();i++)
		{
			a3.add(a1.get(i));
			a3.add(a2.get(i));
		}
		System.out.println(a3);
	}

}
