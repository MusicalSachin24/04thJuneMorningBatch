package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_LoginPageValidation_Using_TestNGAssertions extends /* TestBaseClass_SD1, */ TestBaseClass_SD 
{	
	@Test
	public void validateLoginFunctionality() throws InterruptedException, IOException
	{		
		String givenUrl = "https://www.saucedemo.com/inventory.html";
		log.info("Given url is:--> "+givenUrl);
		String givenTitle= "Swag Labs";
		log.info("Given Login Page title id is:--> "+givenTitle);
		
		String actualUrl =driver.getCurrentUrl();
		log.info("Actual url is:--> "+actualUrl);		
		String actualTitle = driver.getTitle();
		log.info("Actual title of login page is:--> "+actualTitle);
				
		Assert.assertEquals(actualUrl, givenUrl);
		
		Assert.assertEquals(actualTitle, givenTitle,"TC passed");		
	    
		log.info("Assertions have been applied.");		
		
	}

}
