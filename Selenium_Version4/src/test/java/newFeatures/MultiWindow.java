package newFeatures;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	
	
	public static void main(String args[])
	{
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultimatix.net");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
	}

}
