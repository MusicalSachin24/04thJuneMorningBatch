package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
//import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;


public class TestClass_For_LoginPage_ScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();		
		System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");		
		
		ScreenShotsFinal.Screenshot(driver, "Login");
		
		Thread.sleep(5000);
		
		System.out.println("End of program");
	}

}
