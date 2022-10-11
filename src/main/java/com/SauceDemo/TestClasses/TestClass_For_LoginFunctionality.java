package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;

public class TestClass_For_LoginFunctionality 
{
    public WebDriver driver;
    
    @BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe");
	    driver = new ChromeDriver();		
		//System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		ScreenShotsFinal.Screenshot(driver,"Login");	
				
		PageObjectModel_SS_LoginPage_Class a = new PageObjectModel_SS_LoginPage_Class(driver);
		a.sendsUserName();
		System.out.println("User name has been entered successfully");
		a.sendPassword();
		System.out.println("Password has been entered successfully");
		a.clickOnLoginButton();
		System.out.println("Login button has been clicked successfully");		
	    
		Thread.sleep(2000);	
		
		ScreenShotsFinal.Screenshot(driver,"HomePage");	    
	}
    
	@Test
	public void validateLoginFunctionality() throws InterruptedException, IOException
	{		
		String givenUrl = "https://www.saucedemo.com/";
		System.out.println("Given url is:--> "+givenUrl);
		String givenTitle= "Swag Labs";
		System.out.println("Given Login Page title id "+givenTitle);
		
		String actualUrl =driver.getCurrentUrl();
		System.out.println("Actual url is:--> "+actualUrl);		
		String actualTitle = driver.getTitle();
		System.out.println("Actual title of login page is:--> "+actualTitle);
		
		if((givenUrl.equals(actualUrl))&&(givenTitle.equals(actualTitle)))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Browser is closed");
		System.out.println("End of program");		
	}
	
}
