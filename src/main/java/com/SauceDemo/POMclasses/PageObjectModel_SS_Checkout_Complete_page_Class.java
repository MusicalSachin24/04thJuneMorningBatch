package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_SS_Checkout_Complete_page_Class 
{
	
    //1
	private WebDriver driver;
    
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
    //2
	@FindBy(xpath="//button[@id='back-to-products']") private WebElement backHome; 
    //2.1
	public void ClickOnBackHome()
	{
		backHome.click();
	}
    
	PageObjectModel_SS_Checkout_Complete_page_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
