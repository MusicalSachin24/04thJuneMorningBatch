package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMclasses.PageObjectModel_SS_HOMEpage_Class;
import com.SauceDemo.UtilityClasses.ScreenShotsFinal;



public class TC08_LogOutPageValidation_Using_TestNGAssertions extends /* TestBaseClass_SD2, */ TestBaseClass_SD 
{
	@Test
	public void logout() throws InterruptedException, IOException
	{		
		String currentUrl = driver.getCurrentUrl();
		log.info("Current url is:--> "+currentUrl);
		
		PageObjectModel_SS_HOMEpage_Class b = new PageObjectModel_SS_HOMEpage_Class(driver);
        
		boolean B1 = b.checkAppLogo();
		log.info(B1);
		log.info("App logo has been checked");
		
		b.clickOnMenu();
		log.info("Menu button has been clicked successfully");		
		
		Thread.sleep(7000);
		
		ScreenShotsFinal.Screenshot(driver,"Menu");
		log.info("Screenshot of Menu is captured");
		
		b.clickOnLogout();
		log.info("Logout button has been clicked successfully");
		
		ScreenShotsFinal.Screenshot(driver, "Logout");
		log.info("Screenshot after logout is captured");
		
		Thread.sleep(2000);
		
		String givenUrl = "https://www.saucedemo.com/inventory.html";
		log.info("Given url is:-->"+givenUrl);
		
		Assert.assertEquals(currentUrl, givenUrl);
        
		log.info("Assertion has been applied.");
		
	}

}
