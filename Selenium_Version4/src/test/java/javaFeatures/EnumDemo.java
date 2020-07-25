package javaFeatures;


enum automationTools
{
	SELENIUM(55),WORKSOFT(44);
	
	private int x;

	automationTools(int x)
	{
		this.x=x;
	}
	
	public int getValue()
	{
		return x;
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		
		automationTools[] tools=automationTools.values();
		System.out.println("Automation tools are: ");
		for(automationTools tool:tools)
		{
			System.out.println(tool.getValue());
		}
		
		

	}

}
