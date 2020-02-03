package Selenium;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser
{
    public static void main(String[] args)
    {
		String iePath="C:\\Selenium\\jars\\IEDriverServer.exe";
		
		System.setProperty("webdriver.ie.driver",iePath);
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
	
    	
	}
}
