package com.SauceDemo.TestPackage;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.LogOutPage_POMClassSauceDemo;

public class TC_002VerifylogoutFunctionalitySauceDemo extends TestBaseClass {
@Test
public void verifyLogOutFunctionality()
	{
	LogOutPage_POMClassSauceDemo hp = new LogOutPage_POMClassSauceDemo(driver);
	

	
	hp.clicksettingbtn();
	log.info("7.click on setting button");
	
	hp.clicklogout();
	log.info("8.click on logout button");
	log.info("9.apply the validation");

	
	String givenTitle = "Swag Labs";
	String ActualTitle = driver.getTitle();
	if(givenTitle.equals(ActualTitle))
			{
		log.info("logout test case is passed");
			}
	else
	{
        log.info("logout test case is failed");
	}

//	
//
//	@Test
//	public void verifyLogOutFunctionality()
//	{
//	    //click settingBtn and logOutBtn
//		LogOutPage_POMClassSauceDemo hp = new LogOutPage_POMClassSauceDemo(driver);
//		hp.clicksettingbtn();
//	    
//	    System.out.println("Clicked on setting button");
//	    
//	    hp.clicklogout();
//	    System.out.println("Clicked on logOut button");
//	
//	    System.out.println("Went on loginPage");
//	
//	    System.out.println("Apply the validation");
//	    
//	    String givenTitle = "Swag Labs";   //PO/BA/dev		
//		String actualTitle = driver.getTitle();
//		
//		if(givenTitle.equals(actualTitle))
//		{
//			System.out.println("LogOut Test is passed");
//		}
//		else
//		{
//			System.out.println("LogOut Test is failed");
//		}
	}

}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

