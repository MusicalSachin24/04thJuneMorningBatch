package com.SauceDemo.POMclasses;

import java.util.List;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel_SS_HOMEpage_Class 
{
	//1
	private WebDriver driver;
	private Actions action;
	private Select s;
	
	public WebDriver webDriverWarningRemove()
	{		
		return driver;		
	}
	
	//19
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement containerClick;
	//19.1
	public void ClickOnContainer()
	{
		containerClick.click();
	}		
	
	//20
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement containerClickCheck;
	//20.1
	public boolean ClickOnContainerClickCheck()
	{		
		boolean b1 = containerClickCheck.isDisplayed();
		System.out.println(b1);	
		boolean b2 = containerClickCheck.isEnabled();
		System.out.println(b2);	
		containerClickCheck.click();
//		Select s = new Select(containerClickCheck);
		s.selectByValue("lohi");		
		return (b1&&b2);
	}
	
	//21
	@FindBy(xpath="//select[@class='product_sort_container']") private List<WebElement> listContainer;
	//21.2
	public void selectContainerElement()
	{
		for(int i=0; i<listContainer.size();i++)
		{
			String element = listContainer.get(i).getText();
			System.out.println("WebElements are: "+"\n"+element);			
		}
	}
	
	//21
	@FindBy(xpath="//select[@class='product_sort_container']") private List<WebElement> listContainer2;
	//21.2
	public boolean selectContainerElement2()
	{
		
//		Select s = new Select(listContainer2.get(2));
//		s.selectByValue("lohi");
		boolean b3 = listContainer2.get(0).isDisplayed();
		System.out.println(b3);
		return b3;
	}	
	
	public String selectContainerEle2Check()
	{	
		String text2 = listContainer2.get(0).getText().substring(28, 47);
		//System.out.println(text2);
		return text2;
	}
	
	//2 	
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement container;
	//2.1	
	public void clickOnContainer_az() //filter
	{
		container.click();
		
		s.selectByValue("az");
		
	}			
	
	//new
	//2.1	
	public String Container_elementCheck() //filter
	{
		String text0 = container.getText().substring(28, 47);
		
		return text0;		
	}	
	
	
	//2.2
	public void clickOnContainer_za() //filter
	{
		container.click();
//		Select s = new Select(container);
		s.selectByValue("za");
	}
	
	//2.3
	public void clickOnContainer_lohi() //filter
	{
		
//		action.click(container);
//		action.keyDown(Keys.ARROW_DOWN);
//		Thread.sleep(3000);
//		action.keyUp(Keys.ARROW_DOWN);
//		action.keyDown(Keys.ENTER);
//		action.keyUp(Keys.ENTER);
//		action.perform();	
		
		action.click(container);
//		Select s = new Select(container);
		s.selectByValue("lohi");
		
	}
	
	//2.4
	public void clickOnContainer_hilo() //filter
	{
		container.click();
//		Select s = new Select(container);
		s.selectByValue("hilo");
	}

	
	//3
	@FindBy(xpath="//button[text()='Add to cart']") List<WebElement> allElements;  
	//3.1
	public void Add_to_cart_ALL()
	{
//		for(int i=0; i<allElements.size(); i++)
//		{
//			allElements.get(i).click();
//		}
		
		for(WebElement i : allElements)
		{
			i.click();
		}		
	}
	
	
	//4
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement sauceLabsBackpack;
	//4.1
	public void clickOnSauceLabsBackpack()
	{
		sauceLabsBackpack.click();
	}
	
	
	//5
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement sauceLabsBikeLight;
	//5.1
	public void clickOnSauceLabsBikeLight()
	{
		sauceLabsBikeLight.click();
	}
	
	
	//6
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement sauceLabsBoltTshirt;
	//6.1
	public void clickOnSauceLabsBoltTshirt()
	{
		sauceLabsBoltTshirt.click();
	}
	
	
	//7
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement sauceLabsFleeceJacket;
	//7.1
	public void clickOnSauceLabsFleeceJacket()
	{
		sauceLabsFleeceJacket.click();
	}
	
	
	//8
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement sauceLabsOnesie;
	//8.1
	public void clickOnSauceLabsOnesie()
	{
		sauceLabsOnesie.click();
	}	
	
	
	//9
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement testAllTheThingsTshirtRed;
	//9.1
	public void clickOnTestAllTheThingsTshirtRed()
	{
		testAllTheThingsTshirtRed.click();
	}	
	
	
	//10
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	//10.1
	public void clickOnMenu()
	{
		menu.click();
	}	
	
	
	//11
	//inventory_sidebar_link
	@FindBy(xpath="//a[@id='inventory_sidebar_link']") private WebElement allItems;
	//11.1
	public void clickOnAllItems()
	{
		allItems.click();
	}	
	
	
	//12
	@FindBy(xpath="//a[@id='about_sidebar_link']") private WebElement about;
	//12.1
	public void clickOnAbout()
	{
		about.click();
	}	
	
	
	//13
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
	//13.1
	public void clickOnLogout()
	{
		logout.click();
	}		
	
	
	//14
	@FindBy(xpath="//a[@id='reset_sidebar_link']") private WebElement resetAppState;
	//14.1
	public void clickOnResetAppState()
	{
		resetAppState.click();
	}
	
	
	//15
	//a[@class='shopping_cart_link']
    @FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cart;
	//15.1
    public void clickOnCart()
    {
    	cart.click();
    }
    
    //16
    @FindBy(xpath="//div[@class='app_logo']") private WebElement appLogo;
	//16.1
    public boolean checkAppLogo()
    {
    	boolean B = appLogo.isDisplayed();
    	System.out.println(B);
    	return B;
    }
    
    //17
    @FindBy(xpath="//span[text()='6']") private WebElement productsSelected;
	//17.1
	public String checkProductSelected()
	{
	    String a=productsSelected.getText();
	
	    return a;
	}
	
    //18
    public PageObjectModel_SS_HOMEpage_Class(WebDriver driver)
    {
    	this.driver=driver;
    	
    	PageFactory.initElements(driver, this);
    	
    	action = new Actions(driver);
    	
    	s = new Select(container);
    	
    	s = new Select(containerClickCheck);
    }
	
	
}
