package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.PageObjectModel_SS_HOMEpage_Class;
import com.SauceDemo.POMclasses.PageObjectModel_SS_LoginPage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;

public class TestClass_For_FilterDropDown_displayElements 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe");
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
        
		ScreenShotsFinal.Screenshot(driver,"low to high");
		
		Thread.sleep(2000);
	}
	
	@Test 
	public void containerElementDisplay() throws InterruptedException, IOException
	{		
		PageObjectModel_SS_HOMEpage_Class b = new PageObjectModel_SS_HOMEpage_Class(driver);
		
		b.ClickOnContainer();
		System.out.println("Container is clicked successfully");
		
		b.clickOnContainer_lohi();
		
		boolean actualResult = b.selectContainerElement2();
		System.out.println(actualResult);
		
		ScreenShotsFinal.Screenshot(driver,"low to high");
		
		Thread.sleep(2000);
		
        boolean expectedResult = true;
		
        String actualText = b.selectContainerEle2Check();
        System.out.println(actualText);
        
        //String actualText1 = b.Container_elementCheck();
        //System.out.println("Text1:--> "+actualText1);
        
        Thread.sleep(2000);
        
        String givenText = "Price (low to high)";
        System.out.println(givenText);
        
		if ((actualResult==expectedResult)&&(actualText.equals(givenText)))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}		
					
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();;
		System.out.println("End of program");
	}

}
