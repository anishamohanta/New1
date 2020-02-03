package poiDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelMercuryDemo
{
	public static void main(String[] args) throws IOException 
	{
		String chromePath="C:\\Selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		WebDriver driver=new ChromeDriver();
		
		File src=new File("C:\\Users\\Training_B6B.01.07\\Desktop\\login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		driver.manage().window().maximize();
		driver.get("http://demoaut.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Home")).click();
		String expectedTitle= "Welcom: Mercury Tours123";
		String ActualTitle = driver.getTitle();
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total no of rows is :"+rowCount);
		
		for(int i=1;i<=rowCount;i++)
		{
			String firstname=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("First Name is :"+firstname);
			
			String user=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("User :"+user);
			
			String password=sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println("Password is :"+password);
			

			String confpassword=sheet1.getRow(i).getCell(3).getStringCellValue();
			System.out.println("Confirm Password is :"+confpassword);

		
		if (expectedTitle.equals(ActualTitle))
		{
			System.out.println("same");
			sheet1.getRow(0).createCell(5).setCellValue("Results");
			sheet1.getRow(1).createCell(5).setCellValue("Pass : Home page");
		}
		else 
		{
			System.out.println("not in Home");
			sheet1.getRow(0).createCell(3).setCellValue("Fail : not in Home page");
		}
		FileOutputStream fout =new FileOutputStream("C:\\\\Users\\\\Training_B6B.01.07\\\\Desktop\\\\login1.xlsx");
		wb.write(fout);
		fout.close();
	}
	wb.close();
	driver.close();
	}
}

