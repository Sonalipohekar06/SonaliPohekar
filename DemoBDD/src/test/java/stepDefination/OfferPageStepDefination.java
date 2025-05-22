package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OfferPage;
import utils.TestcontextSetup;

public class OfferPageStepDefination {
public String SearchResult;
TestcontextSetup testcontextSetup;


	public OfferPageStepDefination(TestcontextSetup testcontextSetup)
	{
		this.testcontextSetup = testcontextSetup;
	
	}

	@Then("uesr searched for same {string} in offers page to check for if product exist")
	public void uesr_searched_for_same_in_offers_page_to_check_for_if_product_exist(String shortname) throws InterruptedException {
	    {
	       switchToOfferPage();
	       OfferPage offerPage = new OfferPage(testcontextSetup.driver);
	       offerPage.serachItem(shortname);
	     // testcontextSetup.driver.findElement(By.xpath("//input[ @type='search']")).sendKeys(shortname);
			Thread.sleep(2000);
			SearchResult = offerPage.getProuctName();
			//SearchResult = testcontextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	        System.out.println("search result is " +SearchResult);
		}
	}
	
	public void switchToOfferPage()
	{
		//if(testcontextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")
				
		//else {
         LandingPage landingPage = new LandingPage(testcontextSetup.driver);
         landingPage.selectTopDealsPage();
         
		  //testcontextSetup.driver.findElement(By.linkText("Top Deals")).click();
		  Set<String> s1 = testcontextSetup.driver.getWindowHandles();
		  Iterator<String> i1 = s1.iterator();
		  String parentWindow = i1.next();
		  String Childwindow = i1.next();
		  testcontextSetup.driver.switchTo().window(Childwindow);	
		
	}
	@Then("Validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() 
	{
	    System.out.println("search result is " +SearchResult);
		Assert.assertEquals(SearchResult, testcontextSetup.LandingpageproductName);
	}
	}
	
	


