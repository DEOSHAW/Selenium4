package javaFeatures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileDemo {
	
	public static void main(String args[]) throws Exception
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:/Users/Bishal/git/Selenium4/Selenium_Version4/src/main/java/config/Environment.properties");
		prop.load(fis);
		String User=prop.getProperty("Username");
		String Email=prop.getProperty("Username2");
		System.out.println("User is: "+User);
		System.out.println("Email is: "+Email);
		fis.close();
		FileOutputStream fos=new FileOutputStream("C:/Users/Bishal/git/Selenium4/Selenium_Version4/src/main/java/config/Environment.properties");
		
		
		prop.setProperty("Email3", "Laptop4");
		//prop.setProperty("Username3", "Laptop5");
		//prop.setProperty("Username2", "Laptop6");
		//prop.setProperty("Username1", "Laptop6");
		prop.store(fos, "");
		fos.close();
		
		

	}

}
