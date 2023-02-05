package com.SauceDemo.POMPackage;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_PomClassSauceDemo {
	
	WebDriver driver;

	 @FindBy(xpath="//input[@id='user-name']")
	 WebElement username;
	 @FindBy(xpath = "//input[@id='password']")
		WebElement password;
	 @FindBy(xpath="//input[@id='login-button']")
		WebElement loginbtn;

	 @FindBy(xpath="//button[text()='Add to cart'][1]")
		WebElement addtocart;

	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 WebElement AddCartBtn;
	 
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
	
public void addtocart()
{
	addtocart.click();
}
public  String getTextfromAddCartBtn()
{
	String productcount = AddCartBtn.getText();
	return productcount;
}

//	for multiple product
	@FindBy(xpath="//button[text()='Add to cart']")
		List<WebElement>allproducts;
		
	public void clickonallproducts()
	{
//		for each loop
	
		for(WebElement addtocart:allproducts)
	
		{
				   
			addtocart.click();
			
		}
	
	}
//	 constructor of class
	
public AddToCart_PomClassSauceDemo (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	}

	

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

