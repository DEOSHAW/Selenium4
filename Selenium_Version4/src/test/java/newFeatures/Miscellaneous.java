package newFeatures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Miscellaneous {
	
	static HashMap<String,String> map=new HashMap();
	public static void main(String[] args)
	{
		map.put("User1", "Deo");
		map.put("User2","Aman");
		Set<String> keys=map.keySet();
		/*for(String s:keys)
		{
			System.out.println("Value is: "+map.get(s));
			
		}*/
		
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			System.out.println(map.get(itr.next()));
		}
		
		
		
		String Text="a:b:c:d";
		String[] Arr=Text.split(":");
		for(String s: Arr)
		{
			System.out.println(s);
		}
		
	}
	

}
