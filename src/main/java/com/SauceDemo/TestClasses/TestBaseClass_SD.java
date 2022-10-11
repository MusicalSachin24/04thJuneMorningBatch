package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;

public class TestBaseClass_SD 
{
    public WebDriver driver;
    Logger log = Logger.getLogger("Maven_SauceDemo04thJuneMorning");
    @Parameters("browserName")
    @BeforeMethod
	public void setUp(@Optional("optional") String browserName) throws InterruptedException, IOException
	{ 	
    	if(browserName.equals("firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver",
    				"./All_Drivers\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}	
    	
    	else
    	{
    		System.setProperty("webdriver.chrome.driver", "./All_Drivers\\chromedriver.exe");
    	    driver = new ChromeDriver();	
    	}
        
    	PropertyConfigurator.configure("log4j code.properties");
    	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		ScreenShotsFinal.Screenshot(driver,"Login");	
		log.info("Screenshot login page is captured");
		
		PageObjectModel_SS_LoginPage_Class a = new PageObjectModel_SS_LoginPage_Class(driver);
		a.sendsUserName();
		log.info("User name has been entered successfully");
		a.sendPassword();
		log.info("Password has been entered successfully");
		a.clickOnLoginButton();
		log.info("Login button has been clicked successfully");		
	    
		Thread.sleep(7000);	
		
		ScreenShotsFinal.Screenshot(driver,"HomePage");
		log.info("Screenshot of homepage is captured");
		
	}
    
    @AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of program");		
	}

}
