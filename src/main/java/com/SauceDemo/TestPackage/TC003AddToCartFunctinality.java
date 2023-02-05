package com.SauceDemo.TestPackage;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMPackage.AddToCart_PomClassSauceDemo;

public class TC003AddToCartFunctinality extends TestBaseClass{
@Test
public void VerifyAddToCartFunctionality()
{
		AddToCart_PomClassSauceDemo ac = new AddToCart_PomClassSauceDemo(driver);
	
	
//	homepage
	log.info("went on homepage");
	
//	addtocart activity
	log.info("click on addto cart button");
	ac.addtocart();
	log.info("product add to cart");
	ac.clickonallproducts();
	log.info("click on all product");
	
	log.info("click on addcartbtn");
	
	log.info("apply the validation");
	String expectedcount = "6";
	String ActualCount = ac.getTextfromAddCartBtn();
	
	if(expectedcount.equals(ActualCount))
			{
		      log.info("addtocart test case is passed");
			}
	else
	{
		log.info("addtocart testcase is failed");
	}
	

	
//	Assert.assertEquals(expectedcount, ActualCount);
//	
	
	
	
	}	
	
}
