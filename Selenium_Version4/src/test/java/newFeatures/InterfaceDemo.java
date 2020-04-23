package newFeatures;

public interface InterfaceDemo {
	
	void show();

}

interface InterfaceChild extends InterfaceDemo
{
	void display();
}

class A implements InterfaceChild
{

	public void show() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[])
	{
		InterfaceChild ob=new A();
		ob.display();
		
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}


