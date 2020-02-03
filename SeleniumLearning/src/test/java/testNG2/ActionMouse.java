package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse
{
  public static void main(String[] args) 
  {
	  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
actions.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).perform();
actions.moveToElement(driver.findElement(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();	
		
}
}
