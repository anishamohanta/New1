package Selenium;

import org.openqa.selenium.WebDriver;

public class SeleniumStart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new Driver().getDriver("firefox");
		driver.get("https://google.com");
	}
}