package newFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorFeature {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		 /* driver.get("https://www.ultimatix.net");
		  String Text=(String) js.executeScript("return document.getElementById('form1').value");
		  System.out.println("Text is: "+Text);*/
		  driver.get("https://www.google.com");
		 WebElement searchBox= driver.findElement(By.name("q"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].value='Selenium';", searchBox);
		 WebElement searchButton= driver.findElement(By.xpath("(//*[@value='Google Search'])[2]"));
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].click();", searchButton);
		 Thread.sleep(2000);
		WebElement searchText= driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[2]/div/span"));
		String text=(String) js.executeScript("return arguments[0].innerText;", searchText);
		System.out.println("Text is: "+text);
		
		Thread.sleep(2000);
		driver.close();
		  
		  
		  
	}

}
