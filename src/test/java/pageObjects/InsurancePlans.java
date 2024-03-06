package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilityMethods.Excel;

public class InsurancePlans extends BasePage{
	
	public InsurancePlans(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//i[@class='arrow']") 
	WebElement products;
	@FindBy(xpath="//*[@class=\"ruby-col-3 hidden-md\"][2]/ul/li") 
	List<WebElement> insurancePlans;
	
	//Action Methods
	public void NavigateHome() throws InterruptedException {
		driver.navigate().to("https://www.policybazaar.com/");
		Thread.sleep(1000);
		
	}
	
	public void clickInsuranceProducts()
	{
		 Actions actions=new Actions(driver);
         actions.moveToElement(products).perform();
	}
	public void healthInsuranceProducts() throws IOException
	{
		
		for(int i=0;i<insurancePlans.size();i++) {
			String plans = insurancePlans.get(i).getText();
			
		     System.out.println(plans);
		     Excel.setcelldata("Sheet1", plans, i+3, 0);
	       
		}		
		}
	
}
