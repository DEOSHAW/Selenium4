package javaFeatures;

import java.util.*;
import java.util.Set;

public class SetDemo {
	
	
        public static void main(String args[])
         {
        	
        	HashMap<Integer,String> map=new HashMap<Integer,String>();
        	map.put(1454080, "Deo Prasad Shaw");
        	map.put(1454760, "Aman Bhagat");
        	
        	Set<Integer> keys=map.keySet();
        	for(Integer i:keys)
        	{
        		//System.out.println(map.get(i));
        		System.out.println(i);
        	
         }


     }
}
