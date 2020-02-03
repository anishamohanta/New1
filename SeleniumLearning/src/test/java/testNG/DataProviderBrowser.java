package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderBrowser {
  @Test(dataProvider = "dp")
  public void dp(String user,String password,String confPwd) throws InterruptedException 
  {
  
  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",chromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.findElement(By.partialLinkText("REGISTER")).click();
	driver.findElement(By.name("email")).sendKeys(user);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("confirmPassword")).sendKeys(confPwd);
	Thread.sleep(3000);
	driver.close();
	
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"anisha","ani123","ani123"},
      new Object[] {"abhi","abhi123","abhi123"},
    };
  }
}
