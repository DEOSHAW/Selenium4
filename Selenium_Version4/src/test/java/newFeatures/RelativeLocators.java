package newFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {
	
	
	public static void main(String args[]) throws Exception
	{
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
		//WebDriverManager.chromedriver().version("96.0.4664.110").setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.findElement(RelativeLocator.with(By.xpath("//input[@name='lastname']")).below(By.xpath("//*[@name='firstname']"))).sendKeys("Shaw");
	//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shaw");
	Thread.sleep(5000);
	driver.quit();
	
	
	
	}

}
