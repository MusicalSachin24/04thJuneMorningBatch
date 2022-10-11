package com.SauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_SS_LoginPage_Class 
{
	
	//1. declare driver first
	private WebDriver driver; //its a nonStatic type thing
	
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//2. find the first WebElement of the loginPage
	//use "@FindBy" annotation for that
	@FindBy(xpath="//input[@id='user-name']") /*static*/ private WebElement userName;
  //WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
  //userName.sendKeys("standard_user");

	//2.1 create a method for performing action of the above WebElement i.e. userName
	public /*static*/ void sendsUserName()
	{
		userName.sendKeys("standard_user");
	}
	
	//3. find the second WebElement of the loginPage repeating above steps
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	
	//3.1 create a method for performing action of the above WebElement i.e. password
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}	
		
	//4. find the third WebElement of the loginPage using same thing
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginButton;
	
	//4.1 create a method for performing action of the above WebElement i.e. loginButton
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
		
	//Constructor 
	public PageObjectModel_SS_LoginPage_Class(WebDriver driver)
	{       //global  //local
		this.driver =  driver;
		
	//seleniumClass.staticMethod()
	 PageFactory.initElements(driver, this);
	}
	
}
 