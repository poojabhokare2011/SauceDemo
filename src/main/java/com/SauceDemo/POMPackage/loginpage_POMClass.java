package com.SauceDemo.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_POMClass {
	WebDriver driver;
	
	
	 @FindBy(xpath = "//input[@id='user-name']")
	 WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbtn;
	public void Sendusername()
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
	public loginpage_POMClass (WebDriver driver)
	{
		this. driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
}
