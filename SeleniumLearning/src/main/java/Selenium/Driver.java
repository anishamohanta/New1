package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver
{
   public static WebDriver getDriver(String browserName)
   {
	   if(browserName.contentEquals("ie"))
	   {
	   String ieDriverPath="C:\\Selenium\\jars\\IEDriverServer.exe";
	   System.setProperty("webdriver.ie.driver",ieDriverPath);
	   return new InternetExplorerDriver();
   }
   else if (browserName.contentEquals("chrome"))
   {
		   String chromeDriverPath="C:\\Selenium\\jars\\chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver",chromeDriverPath);
	       return new ChromeDriver();
	       
   }
   else 
	   
       return null;
}
}
