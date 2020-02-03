package testNG2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class KeydownWebShop 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement search=driver.findElement(By.cssSelector("input[value='Search store']"));
	    Actions actions=new Actions(driver);
actions.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
Thread.sleep(2000);
actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

Assert.assertTrue(driver.getTitle().contains("Build your own computer"));




}
}
