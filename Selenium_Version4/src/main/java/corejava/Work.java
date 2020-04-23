package corejava;

public class Work {
	public static void main(String args[])
	{
		Task2 ob=new Task2();
		Thread t=new Thread(ob);
		t.start();
		System.out.println("Main method");
	}

}
class Task2 implements Runnable
{

	public void run() {
		System.out.println("This is Run method");
		go();
		
	}
	public void go()
	{
		System.out.println("this is go method");
	}
	
}
