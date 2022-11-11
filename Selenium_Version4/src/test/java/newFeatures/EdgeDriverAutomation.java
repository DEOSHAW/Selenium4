package newFeatures;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverAutomation {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+File.separator+"msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://investors.falabella.com/English/about-us/default.aspx");
		
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'We are striving to achieve a profound cultural transformation')]"));
		String text=(String) js.executeScript("return arguments[0].innerHTML;", ele);
		System.out.println(text);
		driver.close();
		
	}

}
