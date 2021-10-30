package newFeatures;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {
	
	
	public static void main(String args[]) throws Exception
	{
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().version("94.0.4606.61").setup();
		ChromeDriver driver=new ChromeDriver();
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElement(RelativeLocator.with(By.xpath("//input[@name='lastname']")).below(By.xpath("//*[@name='firstname']"))).sendKeys("Shaw");
	Thread.sleep(5000);
	driver.quit();
	}

}
