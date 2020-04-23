package newFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flight {
	


		public static void main (String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		//driver.findElement(By.id("fromCity")).clear();
		driver.findElement(By.id("fromCity")).sendKeys("BOM");
		Thread.sleep(2000L);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		System.out.println("Mumbai Select as source");
		
		driver.close();
		}
		
}


