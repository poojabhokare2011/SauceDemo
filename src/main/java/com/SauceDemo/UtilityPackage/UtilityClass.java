package com.SauceDemo.UtilityPackage;

import java.io.File;

import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	public static void ScreenShotsMethod(WebDriver driver, String name) throws IOException, InterruptedException 
	{
		
		
			{Calendar cal = Calendar.getInstance();
			java.util.Date time= cal.getTime();
			String timestamp= time.toString().replace(":", "").replace(" ", " ");
			System.out.println(time);
			System.out.println(timestamp);

			
			TakesScreenshot ts= (TakesScreenshot)driver;
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);   //byte format
			File destFile = new File("./ScreenShotFolder/" + name+timestamp +".jpg");
			FileHandler.copy(sourceFile, destFile);
			Thread.sleep(3000);
			}

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
}

	
