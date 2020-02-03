package testNG2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowChange 
{
	public static void main(String[] args) 
	{
		 String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromePath);
		  WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/popup.php");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
			
			String MainWindow=driver.getWindowHandle();
			
			Set<String> s1=driver.getWindowHandles();
			
			for(String string : s1)
			{
				String ChildWindow=string;
				System.out.println("child Window unique no"+ChildWindow);
				driver.switchTo().window(ChildWindow);
			}
			driver.findElement(By.name("emailid")).sendKeys("abc@a.com");
			driver.findElement(By.className("btnlogin")).click();
			driver.switchTo().window(MainWindow);
				
			}
			
	}


