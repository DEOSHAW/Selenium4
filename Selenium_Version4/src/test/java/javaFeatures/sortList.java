package javaFeatures;

import java.util.ArrayList;
import java.util.Collections;

public class sortList {
	
	public static void main(String args[])
	{
		
		ArrayList<String> aL=new ArrayList<String>();
		aL.add("Rahul");
		aL.add("Aman");
		aL.add("Deo");
		
		System.out.println(aL);
		Collections.sort(aL);
		System.out.println(aL);
		Collections.sort(aL,Collections.reverseOrder());
		System.out.println(aL);
		
		
		ArrayList<Integer> aN=new ArrayList<Integer>();
		aN.add(20);
		aN.add(30);
		aN.add(10);
		System.out.println(aN);
		Collections.sort(aN);
		System.out.println(aN);
		Collections.sort(aN,Collections.reverseOrder());
		System.out.println(aN);
	}

}
