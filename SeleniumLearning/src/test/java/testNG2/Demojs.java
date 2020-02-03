package testNG2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demojs 
{
  public static void main(String[] args)
  {
	  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromePath);
	  WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mgr30127");
		driver.findElement(By.className("password")).sendKeys("EzAtqy");
		driver.findElement(By.className("btnlogin")).submit();
		
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		
		
		
		
}

}
