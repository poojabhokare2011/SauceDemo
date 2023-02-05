package com.SauceDemo.TestPackage;

import java.io.IOException;
import java.time.Duration;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.swing.text.Utilities;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMPackage.loginpage_POMClass;
import com.SauceDemo.UtilityPackage.UtilityClass;

public class TestBaseClass {
	
	
	
	WebDriver driver;
	
    Logger log = Logger.getLogger("SauceDemo");
	@Parameters("browserName")
	@BeforeMethod
public void setUp(String browserName) throws IOException, InterruptedException
{
if (browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", 
			"./DriverFolder/chromedriver.exe");	
    	 driver = new ChromeDriver();
}
else
{
	System.setProperty("webdriver.firefox.driver",
			"./DriverFolder/geckodriver.exe");	
	
	driver = new FirefoxDriver();
	 
}
 
PropertyConfigurator.configure("log4j.properties");

log.info("browser is opened");

	driver.manage().window().maximize();
	log.info("browser maximize");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");
	log.info("open url ");
//
	 UtilityClass.ScreenShotsMethod(driver, "LoginPage");
	loginpage_POMClass lp = new loginpage_POMClass(driver);
	
	
	lp.Sendusername();
	
	log.info("4.username is entered");
	
	lp.sendpassword();
	log.info("5.password is entered");
	
	lp.clickloginbtn();
	log.info("6.click on loginbutton");
}
	
@AfterMethod
public void tearDown()
{
	
driver.quit();
log.info("11.browser is closed");



log.info("12.end of programme.");


}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

