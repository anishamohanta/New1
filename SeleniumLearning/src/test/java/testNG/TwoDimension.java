package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TwoDimension {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s)
  {
	    System.out.println("age is"+" "+n);
	    System.out.println("name is"+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 25, "Ram" },
      new Object[] { 30, "Raj" },
      new Object[] { 10, "Rani" },
      
    };
  }
}
