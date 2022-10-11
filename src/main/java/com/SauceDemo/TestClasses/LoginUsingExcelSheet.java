package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMclasses.POM_for_Excel_Login;
import com.SauceDemo.UtilityClasses.ExcelClassForSauceDemo;

public class LoginUsingExcelSheet 
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();		
		System.out.println(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		String userN = ExcelClassForSauceDemo.excelSheet1(driver);// returns r1
		System.out.println(userN);
		String passW = ExcelClassForSauceDemo.excelSheet2(driver);// returns r2
		System.out.println(passW);
		
		POM_for_Excel_Login Excel = new POM_for_Excel_Login(driver);
		Excel.loginUserNameExcel(userN);
		
		Excel.loginPasswordExcel(passW);
		
		Excel.clickOnLoginButton();
		
		System.out.println("End of program");
	}

}
