package javaFeatures;

public class Thread1 extends Thread {
	Test1 t;
	Thread1(Test1 t)
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
