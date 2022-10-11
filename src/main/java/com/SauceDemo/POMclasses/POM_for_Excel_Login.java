package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_for_Excel_Login 
{
	private WebDriver driver;
	
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement userName;
	public void loginUserNameExcel(String userN)
	{
		userName.sendKeys(userN);
	}
	
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	public void loginPasswordExcel(String passW)
	{
		password.sendKeys(passW);
	}
    
    @FindBy(xpath="//input[@id='login-button']") private WebElement loginButton;
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public POM_for_Excel_Login(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}
