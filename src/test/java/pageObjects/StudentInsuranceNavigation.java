package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilityMethods.Excel;


public class StudentInsuranceNavigation extends BasePage  {

	
	public StudentInsuranceNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//*[@class='icon-bg homeIconsBg icon-bg-new ti']") 
	WebElement travelInsurance;
	
	@FindBy(xpath="//input[@type='text']") 
	WebElement searchbar;
	
	@FindBy(xpath="//li[text()='Germany']") 
	WebElement countrySelect;
	
	@FindBy(css="button.travel_main_cta") 
	WebElement next1;
	
	@FindBy(xpath="(//input)[1][@class='MuiInputBase-input MuiOutlinedInput-input']") 
	WebElement startDate;
	
	@FindBy(xpath="(//input)[2][@class='MuiInputBase-input MuiOutlinedInput-input']") 
	WebElement endDate;
	
	@FindBy(xpath="//button[@class=\"travel_main_cta\"]") 
	WebElement next2;
	
	@FindBy(xpath="//label[@for='traveller_2']") 
	WebElement travellers;
	
	@FindBy(xpath="//div[text()='Select age of traveller 1']") 
	WebElement traveller1;
	
	@FindBy(xpath="//label[text()='22 years']") 
	WebElement traveller1age;
	
	@FindBy(xpath="//div[text()=\"Select age of traveller 2\"]") 
	WebElement traveller2;
	
	@FindBy(xpath="//label[text()='21 years']") 
	WebElement traveller2age;
	
	@FindBy(xpath="//button[@class='travel_main_cta']") 
	WebElement next3;
	
	@FindBy(xpath="//input[@id=\"ped_no\"]") 
	WebElement selectno;
	
	@FindBy(xpath="//input[@inputmode=\"numeric\"][@type=\"text\"]") 
	WebElement mobileno;
	
	@FindBy(css=".travel_main_cta") 
	WebElement enter;
	
	@FindBy(xpath="//input[@id=\"studentTrip\"]") 
	WebElement plan;
	
	@FindBy(xpath="//input[@type=\"checkbox\"][@id=\"Traveller_1\"]") 
	WebElement clickingTraveller1;
	
	@FindBy(xpath="//input[@type=\"checkbox\"][@id=\"Traveller_2\"]") 
	WebElement clickingTraveller2;
	
	@FindBy(xpath="//select[@id='feet']") 
	WebElement tripDuration;
	
	@FindBy(xpath="//*[text()='Apply']") 
	WebElement apply;
	
	@FindBy(xpath="//p[@class='filter_name_heading']") 
	WebElement clickSort;
	
	@FindBy(xpath="//input[@id='17_sort']") 
	WebElement sortPrice;
	
	@FindBy(xpath="//p[@class='quotesCard--insurerName']") 
	List<WebElement> insName;
	
	@FindBy(xpath="//span[@class='premiumPlanPrice']") 
	List<WebElement> premiumPrice;
	
	//Action Methods
	public void clickTravelInsurance()
	{
		JavascriptExecutor js0 = (JavascriptExecutor)driver;
		js0.executeScript("arguments[0].click()", travelInsurance);
		//travelInsurance.click();
	}
	public void clickCountry() throws IOException
	{
		searchbar.click();
		searchbar.sendKeys(Excel.getcelldata("Sheet1", 1, 0));
	}
	public void clickCountryName()
	{
		//countrySelect.click();
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click()", countrySelect);
	}
	public void clickNext1()
	{
		next1.click();
	}
	public void EnterStartDate(String futuredate)
	{
		startDate.sendKeys(futuredate);
	}
	public void EnterEndDate(String futuredate2)
	{
		endDate.sendKeys(futuredate2);
	}
	public void clickNext2()
	{
		next2.click();
	}
	public void clickTravellers()
	{
		travellers.click();
	}
	public void clickTraveller1() throws InterruptedException
	{
		traveller1.click();
		Thread.sleep(2000);
	}
	public void selectTraveller1Age() throws InterruptedException
	{
		traveller1age.click();
		Thread.sleep(2000);
	}
	public void clickTraveller2() throws InterruptedException
	{
		traveller2.click();
		Thread.sleep(2000);
	}
	public void selectTraveller2Age() throws InterruptedException
	{
		traveller2age.click();
		Thread.sleep(2000);
	}
	public void clickNextButton()
	{
		JavascriptExecutor js2 = (JavascriptExecutor)driver;	   
		js2.executeScript("arguments[0].click()", next3);

		
	}
	public void clickNo()
	{
		selectno.click();
	}

	public void EnterMobile() throws IOException
	{
		mobileno.sendKeys(Excel.getcelldata("Sheet1", 3, 0));
	}
	public void clickEnter()
	{
		enter.click();
	}
	public void selectPlan() throws InterruptedException
	{
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click()", plan);
		Thread.sleep(2000);
		//plan.click();
	}
	public void selectTraveller1CheckBox() throws InterruptedException
	{
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
	    js4.executeScript("arguments[0].click()", clickingTraveller1);
		Thread.sleep(2000);
		//traveller1.click();
	}
	public void selectTraveller2CheckBox() throws InterruptedException
	{
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].click()", clickingTraveller2);
		Thread.sleep(2000);
		//traveller2.click();
	}
	public void selectTravelDuration()
	{
		Select drpdwn = new Select(tripDuration);
		drpdwn.selectByValue("1");
	}
	public void clickApply() throws InterruptedException
	{
		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		js6.executeScript("arguments[0].click()", apply);
		//apply.click();
	}
	public void sortFilter() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js7 = (JavascriptExecutor)driver;  
		js7.executeScript("arguments[0].click()", clickSort);

		
	}
	public void clickSortPrice() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor js8 = (JavascriptExecutor)driver;
		js8.executeScript("arguments[0].click()", sortPrice);
		//sortprice.click();
	}
	public void printCompanyName() throws IOException
	{
		List<String> companyname = new ArrayList<String>();
		   for(int i=0;i<3;i++) {
			   companyname.add(insName.get(i).getText());
			   Excel.setcelldata("Sheet1",insName.get(i).getText() , 0, i);
   
		   }
		  System.out.println(companyname);
	}
	public void printPrices() throws InterruptedException, IOException
	{
		List<String> prices = new ArrayList<String>();
		   for(int i=0;i<3;i++) {
			   prices.add(premiumPrice.get(i).getText());
			   Excel.setcelldata("Sheet1",premiumPrice.get(i).getText() , 1, i);
  
		   }
		   System.out.println(prices);
		   Thread.sleep(1000);
	}
}
