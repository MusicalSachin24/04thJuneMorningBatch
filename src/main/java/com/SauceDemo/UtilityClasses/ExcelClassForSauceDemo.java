package com.SauceDemo.UtilityClasses;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelClassForSauceDemo 
{
	public static String excelSheet1(WebDriver driver) throws IOException
	{
		String pathOfFile = "G:\\Testing\\Class Notes\\Selenium\\Excel3\\Kalpana.xlsx";
		FileInputStream file = new FileInputStream (pathOfFile);
		XSSFWorkbook kalpanaWB = new XSSFWorkbook(file);
		System.out.println(kalpanaWB);
		String r1 = kalpanaWB.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(r1);
//		String r2 = kalpanaWB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		System.out.println(r2);
		
		System.out.println("End of excelSheet1() method");		
		return (r1);
	}
	
	public static String excelSheet2(WebDriver driver) throws IOException
	{
		String pathOfFile = "G:\\Testing\\Class Notes\\Selenium\\Excel3\\Kalpana.xlsx";
		FileInputStream file = new FileInputStream (pathOfFile);
		XSSFWorkbook kalpanaWB = new XSSFWorkbook(file);
		System.out.println(kalpanaWB);
//		String r1 = kalpanaWB.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(r1);
		String r2 = kalpanaWB.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(r2);
		
		System.out.println("End of excelSheet2() method");		
		return r2;
	}

}
