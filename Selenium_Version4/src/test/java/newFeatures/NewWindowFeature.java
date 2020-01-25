package newFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;

public class NewWindowFeature {
	
	public static void main(String args[]) throws InterruptedException
	{   WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String parentWindow=driver.getWindowHandle();
		Thread.sleep(2000);
		//driver.findElement(RelativeLocator.withTagName("input").below(By.xpath("//*[@jsname='vdLsw']"))).sendKeys("Selenium");
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.navigate().to("https://www.ultimatix.net");
		//newTab.manage().window().maximize();
		Thread.sleep(5000);
		newTab.findElement(By.xpath("//*[@id='form1']")).sendKeys("856520");
		Thread.sleep(5000);
		newTab.close();
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
