package newFeatures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerTest {
	
	
	public static void main(String args[]) throws Exception
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),cap);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Docker");
		Thread.sleep(2500);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
