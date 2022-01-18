package newFeatures;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ClickingMultipleLinks {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bishal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement LinkArray=driver.findElement(By.xpath("//*[normalize-space(text())='Make Money with Us']/parent::div"));
		List<WebElement> allLinks=LinkArray.findElements(By.tagName("a"));
		String input=Keys.chord(Keys.CONTROL,Keys.ENTER);
		Actions actions=new Actions(driver);
		
		Iterator<WebElement> itr=allLinks.iterator();
		while(itr.hasNext())
		{
			itr.next().sendKeys(input);
			
		}
		//for(int i=0;i<allLinks.size();i++)
		//{
			//allLinks.get(i).sendKeys(input);
		//}
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
