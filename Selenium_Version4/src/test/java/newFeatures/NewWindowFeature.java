package newFeatures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;

public class NewWindowFeature {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{   WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		File srcFile=driver.findElement(By.xpath("//*[@alt='Google']")).getScreenshotAs(OutputType.FILE);
		String parentWindow=driver.getWindowHandle();
		Thread.sleep(2000);
		//driver.findElement(RelativeLocator.withTagName("input").below(By.xpath("//*[@jsname='vdLsw']"))).sendKeys("Selenium");
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.navigate().to("https://www.ultimatix.net");
		newTab.manage().window().maximize();
		Thread.sleep(5000);
		newTab.findElement(By.xpath("//*[@id='form1']")).sendKeys("856520");
		Thread.sleep(5000);
		newTab.close();
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+File.separator+"Image.png"));
		Thread.sleep(2000);
		driver.close();
	
		
		
		
	}

}
