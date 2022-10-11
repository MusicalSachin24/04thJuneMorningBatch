package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.PageObjectModel_SS_HOMEpage_Class;
import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;

public class TestClass_For_FilterDropDown_clickFunctionality 
{
	@Test
	public static void clickOnContainer() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();		
		//System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		ScreenShotsFinal.Screenshot(driver,"Login");	
		PageObjectModel_SS_LoginPage_Class a = new PageObjectModel_SS_LoginPage_Class(driver);		
		a.sendsUserName();
		System.out.println("User name has been entered successfully");
		a.sendPassword();
		System.out.println("Password has been entered successfully");
		a.clickOnLoginButton();
				
		System.out.println("Login button has been clicked successfully");
        
		Thread.sleep(0);
		
		PageObjectModel_SS_HOMEpage_Class b = new PageObjectModel_SS_HOMEpage_Class(driver);
        
		b.ClickOnContainer();
		System.out.println("Container is clicked successfully");
		boolean actualResult = b.ClickOnContainerClickCheck();
		System.out.println(actualResult);
		
		boolean expectedResult = true;
		System.out.println(expectedResult);
		
		b.selectContainerElement();
		
		if(expectedResult==actualResult)
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}		
		
		System.out.println("End of program");
	}
}
