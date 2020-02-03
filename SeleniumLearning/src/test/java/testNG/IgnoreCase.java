package testNG;

import org.testng.annotations.Test;

public class IgnoreCase
{
  @Test(enabled =false,priority=1)
  public void test1()
  {
	  System.out.println("Inside test1()");
  }
  @Test
  public void test3()
  {
	  System.out.println("test2()");
  }
  @Test
  public void test4()
  {
	  System.out.println("test3()");
  }
  @Test(enabled =false)
  public void Test5()
  {
	  System.out.println("test2()");
  }
}
