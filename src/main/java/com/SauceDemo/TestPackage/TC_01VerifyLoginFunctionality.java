package com.SauceDemo.TestPackage;




import java.io.IOException;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC_01VerifyLoginFunctionality  extends TestBaseClass{
	
//		
//	
//	@Test
//	public void VerifyloginFunctionality()
//	{
//	System.out.println("8.apply the validation");
////	
//	String givenTitle = "Swag Labs";
//	String ActualTitle = driver.getTitle();
//	
//	
//
//	if(givenTitle.equals(ActualTitle))
//	{
//		System.out.println("login test case is passed");
//	}
//	else
//	{
//		System.out.println("login test case is failed");
//	}
//	
//	}
//}
//	
	
	
	@Test
	public void verifyLoginFunctionality() throws IOException
	{	
	    //--validation apply
	    log.info("Apply the validation");
	    
	    
	    String givenTitle = "Swag Labs";   //PO/BA/dev		
		String actualTitle = driver.getTitle();
		
		if(givenTitle.equals(actualTitle))
		{
			log.info("login test case is passed");
		}
		else
		{
			log.info("Login Test is failed");
		}
		
//		Assert.assertEquals(actualTitle,givenTitle );
		
		
		
		
		
		
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

