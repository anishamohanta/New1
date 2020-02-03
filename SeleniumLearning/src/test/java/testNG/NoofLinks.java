package testNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class NoofLinks 
{
	public static void main(String[] args) throws Exception
	{
		
	
	String baseUrl="http://www.newtours.demoaut.com/";
	String path="C:\\Selenium\\jars\\chromedriver";
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver driver=new ChromeDriver();
	driver.get(baseUrl);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains("Welcome : MercuryTours"));
	
	List<WebElement> linkedList=driver.findElements(By.tagName("a"));
	System.out.println("Number of links :- "+linkedList.size());
	for(WebElement link : linkedList)
	{
		System.out.println(link.getText() +" :-" +link.getAttribute("href"));
	}
	
}
}
