package corejava;

public class Task {

	public static void main(String[] args) {
		Thread t1=new Task1();
		t1.start();
		System.out.println("Executing main thread");
		
		

	}

}

class Task1 extends Thread
{
	
	public void run()
	{
		System.out.println("Executing Task1 thread");
		go();
	}
	
	public void go()
	{
		System.out.println("Executing go method");
		Task1.more();
	}
	public static void more()
	{
	  System.out.println("Executing more method");
	}
	
}
