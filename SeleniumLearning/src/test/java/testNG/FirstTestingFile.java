package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.testng.Assert.fail;
import org.testng.annotations.Test;

public class FirstTestingFile 
{
  public String baseUrl="http://newtours.demoaut.com/";
  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
  public WebDriver driver;
  @Test(priority=1)
  public void verifyHomepageTitle()
  {
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver",chromePath);
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  String expectedTitle="Welcome: Mercury Tours";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	  
	  driver.close();
  }

}
