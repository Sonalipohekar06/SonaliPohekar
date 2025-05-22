package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	By search= By.xpath("//input[ @type='search']");
	By productName=By.xpath("//input[ @type='search']");
	By topDeals=By.linkText("Top Deals");
	
	
	public void serachItem(String name)
	
	{
		driver.findElement(search).sendKeys(name);
		 
	}
	
	public void getSearchText()
	{
	driver.findElement(search).getText();
	
	}
	public String getProuctName()
	{
		return driver.findElement(productName).getText();
		
		
	}
	public void selectTopDealsPage()
	{ 
		driver.findElement(topDeals).click();
	}
	
}
