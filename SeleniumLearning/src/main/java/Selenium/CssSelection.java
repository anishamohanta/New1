package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelection 
{
  public static void main(String[] args) {
	  String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name=\"login\"]")).click();
		driver.findElement(By.cssSelector("a[href='mercurywelcome.php']")).click();
}
}
