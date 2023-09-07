package newFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.majorleaguepickleball.net/");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Accept')]")));
		Thread.sleep(1000);
		WebElement closeButton=driver.findElement(By.xpath("//a[@aria-label='Close Popup']//*[local-name()='svg']"));
		try
		{
		closeButton.click();
		}
		catch(WebDriverException e)
		{
			e.printStackTrace();
		}
        WebElement League=driver.findElement(By.xpath("(//a[contains(text(),'League')])[1]"));
		actions.moveToElement(League)
		.click(driver.findElement(By.xpath("(//a[contains(text(),'League Standings')])[1]"))).perform();
		
		List<WebElement> allTeams=driver.findElements(By.xpath("//table[@aria-label='2023 League Table']//tbody//tr//td[1]//span[contains(@class,'name')]"));
		
		for(WebElement team:allTeams)
		{
			System.out.println(team.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
