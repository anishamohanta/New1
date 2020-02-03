package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementToursDemo {

	public static void main(String[] args)
	{
		
         String iePath="C:\\Selenium\\jars\\IEDriverServer";
         System.setProperty("webdriver.ir.driver",iePath);
         
         WebDriver driver=new InternetExplorerDriver();
         driver.get("https://newtours.demoaut.com/");
         String title=driver.getTitle();
         System.out.println(title);
         
         WebElement Uname=driver.findElement(By.className("userName"));
         Uname.sendKeys("mercury");
         Uname.clear();
         
         WebElement Pwd=driver.findElement(By.className("password"));
         Pwd.sendKeys("mercury");
         
         WebElement signIn=driver.findElement(By.className("Login"));
         signIn.click();
         
         WebElement home=driver.findElement(By.linkText("Home"));
         String text=home.getText();
         System.out.println(text);
         home.click();
	}

}
