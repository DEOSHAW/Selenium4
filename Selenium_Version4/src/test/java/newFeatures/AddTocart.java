package newFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {

	public static void main(String[] args) throws InterruptedException {
		String item;
		int i=0;
		int k=0;
		String[] Commodities= {"Cucumber","Brocolli","Beetroot"};
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(WebElement prod:products)
		{
			if(k==Commodities.length)
			{
				break;
			}
			
			
			i++;
			item=prod.getText();
			for(String s:Commodities)
			{
				
				if(item.contains(s))
				{
					
					System.out.println("Product is: "+item);
					System.out.println("Index is: "+i);
					//driver.findElement(By.xpath("(//*[@class='product-action'])["+i+"]")).click();
					driver.findElement(By.xpath("(//*[text()='ADD TO CART'])["+i+"]")).click();
					Thread.sleep(5000);
					k++;
					
					
				}
				
				
			}
			
		}
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
