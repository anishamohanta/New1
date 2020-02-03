package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ChromeBro 
{
  public static void main(String[] args) 
  {
	String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",chromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("Anisha");
	driver.findElement(By.name("lastName")).sendKeys("Mohanta");
	driver.findElement(By.name("phone")).sendKeys("95374555");
	driver.findElement(By.name("email")).sendKeys("a.mohanta@gmail.com");
	driver.findElement(By.name("userName")).sendKeys("annie");
	driver.findElement(By.name("password")).sendKeys("ani123");
	driver.findElement(By.name("confirmPassword")).sendKeys("ani123");
	driver.findElement(By.name("register")).click();
	 Select select=new Select(driver.findElement(By.className("country")));
	 select.deselectByVisibleText("INDIA");
	 
	 //ABSOLUTE PATH
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
	 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
	 
	 //RELATIVE PATH
	 driver.findElement(By.xpath("//td[2]/input")).sendKeys("mercury");
	 driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("mercury");
	 driver.findElement(By.xpath("//div/input")).click();
	 
	
}
}
