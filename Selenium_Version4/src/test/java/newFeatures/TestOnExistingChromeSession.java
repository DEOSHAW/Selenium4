package newFeatures;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOnExistingChromeSession {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().version("100.0.4896.60").setup();
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:56938");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Capabilities cap= ((ChromiumDriver) driver).getCapabilities();
		Map<String, Object> config=cap.asMap();
		System.out.println(config);
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
	
		
			
			
	
		
		
	}

}
