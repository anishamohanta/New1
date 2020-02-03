package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cs11
{
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  
		  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromePath);
			 driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/");
	  }
	  @Test(priority=1)
	  public void signUp()
	  {
		  driver.findElement(By.linkText("SignUp")).click();
		  driver.findElement(By.id("userName")).sendKeys("AnnieAnisha");
		  driver.findElement(By.id("firstName")).sendKeys("Ani");
		  driver.findElement(By.id("lastName")).sendKeys("Anisha");
		  driver.findElement(By.id("password")).sendKeys("mom123");
		  driver.findElement(By.id("pass_confirmation")).sendKeys("mom123");
		  driver.findElement(By.xpath("//input[@value='Female' and @type='radio']")).click();
		  driver.findElement(By.id("emailAddress")).sendKeys("ani365@gmail.com");
		  driver.findElement(By.id("mobileNumber")).sendKeys("9438031545");
		  driver.findElement(By.id("dob")).sendKeys("19-03-1997");
		  driver.findElement(By.id("address")).sendKeys("Bhubaneswar");
		  Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		  sel.selectByIndex(1);
		  driver.findElement(By.id("answer")).sendKeys("black");
		  driver.findElement(By.name("Submit")).click();
	  }
	  @Test(priority=2)
	  public void login()
	  {
		  driver.findElement(By.name("userName")).sendKeys("AnnieAnisha");
		  driver.findElement(By.name("password")).sendKeys("mom123");
		  driver.findElement(By.name("login")).click();
	  WebDriverWait wait=new WebDriverWait(driver,1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("val")));
		  Assert.assertEquals("SignOut", driver.getTitle());
		  System.out.println("logged in!!!");
	  }
	  
}
