package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftassetDemo 
{
	public static void main(String[] args) 
		{
	  
		  SoftAssert sa=new SoftAssert();
		  System.out.println("Test case two started***");
		  sa.assertEquals("hello","Hello","First soft assert failed");
		  
		  System.out.println("hard assert success.........");
		  
		  sa.assertTrue("hello".equals("hello"),"Second sofet assert failed");
		  sa.assertTrue("Welcome".equals("welcome"),"Third soft assert failed");
		   
		  System.out.println("**********test case two executed successfully*****");
		  sa.assertAll();
		  
	  }

	}

