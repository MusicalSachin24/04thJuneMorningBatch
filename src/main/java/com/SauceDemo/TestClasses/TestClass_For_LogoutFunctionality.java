package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.PageObjectModel_SS_HOMEpage_Class;
import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;

public class TestClass_For_LogoutFunctionality 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./All_Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();		
		//System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		PageObjectModel_SS_LoginPage_Class a = new PageObjectModel_SS_LoginPage_Class(driver);		
		a.sendsUserName();
		System.out.println("User name has been entered successfully");
		a.sendPassword();
		System.out.println("Password has been entered successfully");
		a.clickOnLoginButton();
		System.out.println("Login button has been clicked successfully");
		
		ScreenShotsFinal.Screenshot(driver, "Login");

		Thread.sleep(2000);
	}
	
	@Test
	public void logout() throws InterruptedException, IOException
	{
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url is:--> "+currentUrl);
		
		PageObjectModel_SS_HOMEpage_Class b = new PageObjectModel_SS_HOMEpage_Class(driver);

		boolean B1 = b.checkAppLogo();
		System.out.println("App logo has been checked");
		
		b.clickOnMenu();
		System.out.println("Menu button has been clicked successfully");		
		
		b.clickOnLogout();
		System.out.println("Logout button has been clicked successfully");
		
		ScreenShotsFinal.Screenshot(driver, "Logout");
		
		Thread.sleep(2000);
		
		String givenUrl = "https://www.saucedemo.com/inventory.html";
		System.out.println("Given url is:-->"+givenUrl);
		
		if((givenUrl.equals(currentUrl))&&(B1==true))
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
		System.out.println("End of program");
	}
}
