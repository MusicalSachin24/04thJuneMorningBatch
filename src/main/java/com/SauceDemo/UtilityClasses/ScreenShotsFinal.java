package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.Duration;
import java.util.Date;

//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.support.PageFactory;

//import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;

public class ScreenShotsFinal 
{	
	public static void Screenshot(WebDriver driver, String ScreenshotName) throws InterruptedException, IOException
	{		
		Date d = new Date();
		System.out.println(d);
		DateFormat df = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		System.out.println(df);
		
		String date = df.format(d);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		System.out.println(ts);
		
		Thread.sleep(5000);
	
		File sourceFile =ts.getScreenshotAs(OutputType.FILE);
		System.out.println(sourceFile);
		
		File destinationFile = new File("./Maven_Saucedemo_Screenshots\\"+ScreenshotName+"-"+date+".jpg");
		System.out.println(destinationFile);
		
		FileHandler.copy(sourceFile, destinationFile);
		
		System.out.println("End of ScreenShot1() method");	
	}
	

}
