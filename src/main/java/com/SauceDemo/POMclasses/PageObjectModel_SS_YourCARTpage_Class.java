package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_SS_YourCARTpage_Class 
{ 
	//1
	private WebDriver driver;
	
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//2
	//button[@id='remove-sauce-labs-bolt-t-shirt']
	@FindBy(id="remove-sauce-labs-bolt-t-shirt") private WebElement removeSauceLabsboltTshirt;
    //2.1
	public void ClickOnRemoveTshirt()
	{
		removeSauceLabsboltTshirt.click();
	}
	
	//3
	//button[@id='checkout']
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkout;
	//3.1
	public void clickOnCheckout()
	{
		checkout.click();
	}
	
	//4
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueShopping;
	//4.1
	public void clickOnContinueShopping()
	{
		continueShopping.click();
	}
	
	//4
	PageObjectModel_SS_YourCARTpage_Class(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
