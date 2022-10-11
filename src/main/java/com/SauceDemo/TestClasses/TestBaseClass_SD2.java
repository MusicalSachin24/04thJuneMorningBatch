package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;

public class TestBaseClass_SD2 
{
    public WebDriver driver;
    
    @Parameters("browserName2")
    @BeforeMethod
	public void setUp(@Optional("optional") String browserName2) throws InterruptedException, IOException
	{
    	System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe");
    	driver = new ChromeDriver();	
    	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		//ScreenShotsFinal.Screenshot(driver,"Login");	
				
		PageObjectModel_SS_LoginPage_Class a = new PageObjectModel_SS_LoginPage_Class(driver);
		a.sendsUserName();
		System.out.println("User name has been entered successfully");
		a.sendPassword();
		System.out.println("Password has been entered successfully");
		a.clickOnLoginButton();
		System.out.println("Login button has been clicked successfully");		
	    
		//Thread.sleep(2000);	
		
		//ScreenShotsFinal.Screenshot(driver,"HomePage");	    
	}
    
    @AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
		System.out.println("End of program");		
	}

}
