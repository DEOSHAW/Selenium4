package newFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		    
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
          options.addArguments("headless");
          options.addArguments("window-size=1200x600");
          WebDriver driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://www.ultimatix.net");
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  String Text=(String) js.executeScript("return document.getElementById('form1').value");
		  System.out.println("Text is: "+Text);

	}

}
