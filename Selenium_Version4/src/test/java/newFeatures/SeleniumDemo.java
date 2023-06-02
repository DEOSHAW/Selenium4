package newFeatures;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		for(WebElement individualLink:allLinks)
		{
			individualLink.getAttribute("href");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
