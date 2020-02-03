package poiDemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest{
@BeforeSuite
public void beforeSuite()
{
	  System.out.println("Inside Before google Suite");
}

@AfterSuite
public void afterSuite() 
{
	  System.out.println("Inside After google Suite");
}
@BeforeTest
public void beforeTest() 
{
	  System.out.println("Before google Tests");
}

@AfterTest
public void afterTest()
{
	  System.out.println("After google Tests");
}
@BeforeClass
public void beforeClass() 
{
	  System.out.println("Before google Test class");
}

@AfterClass
public void afterClass() 
{
	  System.out.println("After google Test class");
}

@BeforeMethod
public void beforeMethod() 
{
	  System.out.println("Before each google Test");
}

@AfterMethod
public void afterMethod()
{
	  System.out.println("After each google Test");
}
@Test
public void yahooNewsTest() 
{
	  System.out.println("Testing google News");
}
}


