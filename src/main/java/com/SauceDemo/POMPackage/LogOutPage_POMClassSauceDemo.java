package com.SauceDemo.POMPackage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage_POMClassSauceDemo {

	WebDriver driver;
	

	 @FindBy(xpath="//input[@id='user-name']")
	 WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement settingbtn;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	public void clicksettingbtn() 
	{
		settingbtn.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
	
	public  LogOutPage_POMClassSauceDemo(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
	
	
	
	
}
