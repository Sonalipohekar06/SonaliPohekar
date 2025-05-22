package stepDefination;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TestcontextSetup;

public class LandingPageStepDefination {
	
public WebDriver driver;
public String LandingpageproductName;
public String SearchResult;
TestcontextSetup testcontextSetup;

public LandingPageStepDefination (TestcontextSetup testcontextSetup)
{
	this.testcontextSetup = testcontextSetup;
	
}
	
 @Given("User is on Greencart landing page")
public void user_is_on_greencart_landing_page ()
	{
		System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver-win64\\chromedriver.exe");
		testcontextSetup.driver=new ChromeDriver();
		testcontextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
	}
	
@When("User searched with shortname {string} and extracted actual name of product") 
public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException
	{
	 LandingPage landingPage = new LandingPage(testcontextSetup.driver);
     landingPage.serachItem(shortname);
	//testcontextSetup.driver.findElement(By.xpath("//input[ @type='search']")).sendKeys(shortname);
   Thread.sleep(200);
	 testcontextSetup.LandingpageproductName = landingPage.getProuctName().split("-")[0].trim();
	 System.out.println("product name is extracted " + testcontextSetup.LandingpageproductName);		
	}
}


/*	
 * 
@Then("uesr searched for same {string} in offers page to check for if product exist")
public void uesr_searched_for_same_in_offers_page_to_check_for_if_product_exist(String shortname) {
    {
     driver.findElement(By.linkText("Top Deals")).click();
	 Set<String> s1 = driver.getWindowHandles();
	 Iterator<String> i1 = s1.iterator();
			String parentWindow = i1.next();
			String Childwindow = i1.next();
			driver.switchTo().window(Childwindow);
			driver.findElement(By.xpath("//input[ @type='search']")).sendKeys(shortname);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        SearchResult = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		}
	}
	@Then("Validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(productName, SearchResult);
	} */
	
	
	

	
		
		
		
	
