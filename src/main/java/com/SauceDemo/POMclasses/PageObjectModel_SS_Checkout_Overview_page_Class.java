package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_SS_Checkout_Overview_page_Class 
{   
	//1
	private WebDriver driver;

	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//2
	//finish
	@FindBy(xpath="//button[@id='finish']") private WebElement finish;
    //2.1
	public void clickOnFinish()
	{
		finish.click();
	}
	
	//3
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancel;
    //3.1
	public void clickOnCancel()
	{
		cancel.click();
	}
	
	//4
	PageObjectModel_SS_Checkout_Overview_page_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
}
