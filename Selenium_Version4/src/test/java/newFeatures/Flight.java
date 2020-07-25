package newFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flight {
	


		public static void main (String[] args) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Bishal/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://makemytrip.com");
		//driver.findElement(By.id("fromCity")).clear();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("fromCity")).sendKeys("BOM");
		//Thread.sleep(2000L);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(5000);
		System.out.println("Mumbai Select as source");
		
		driver.close();
		}
		
}


