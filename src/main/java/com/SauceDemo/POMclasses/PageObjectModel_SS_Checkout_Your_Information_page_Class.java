package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_SS_Checkout_Your_Information_page_Class 
{  
	//1
	private WebDriver driver;
	
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//2
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstName;
    //2.1
	public void enterFirstName()
	{
		firstName.sendKeys("Kalpana");
	}
	
	//3
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastName;
	//3.1
	public void enterLastName()
	{
		lastName.sendKeys("Rathod");
	}
	
	//4
	@FindBy(xpath="//input[@id='postal-code']") private WebElement zip_PostalCode;
	//4.1
	public void enterZipPostalCode()
	{
		zip_PostalCode.sendKeys("431131");
	}
	
	//5
	@FindBy(xpath="//input[@id='continue']") private WebElement continuE;
	//5.1
	public void clickOnContinue()
	{
		continuE.click();
	}				
	
	//cancel
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancel;
	//5.1
	public void clickOnCancel()
	{
		cancel.click();
	}		
	
	PageObjectModel_SS_Checkout_Your_Information_page_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
