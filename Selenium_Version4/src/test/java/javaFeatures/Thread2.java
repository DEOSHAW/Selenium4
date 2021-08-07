package javaFeatures;

public class Thread2 extends Thread {
	Test1 t;
	
	Thread2(Test1 t)
	{
		this.t=t;
	}
	
	public void run()
	{
		
		try {
			t.show();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
