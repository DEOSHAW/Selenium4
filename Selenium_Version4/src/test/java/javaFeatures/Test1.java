package javaFeatures;
import javaFeatures.Thread1;
import javaFeatures.Thread2;

public class Test1 {
	
	
	synchronized void show() throws InterruptedException
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(400);
		}
	}
	
	
	public static void main(String args[]) throws Exception
	{
		Test1 t=new Test1();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
		
	}

}
