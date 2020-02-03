package poiDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetDemo 
{
	public static void main(String[] args) throws IOException 
	{
		File src=new File("C:\\Users\\Training_B6B.01.07\\Desktop\\login.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
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
			
			
			
		}
		
		
		
		
	}

}
