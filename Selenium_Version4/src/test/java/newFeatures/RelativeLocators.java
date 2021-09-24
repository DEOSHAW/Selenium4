package newFeatures;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	
	
	public static void main(String args[]) throws Exception
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
	
	driver.findElement(RelativeLocator.with(By.xpath("//input[@name='firstname']")).toRightOf(By.name("firstname"))).sendKeys("Deo");
	Thread.sleep(5000);
	}

}
