package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilityMethods.Excel;

public class CarInsuranceNavigation  extends BasePage {
	
	
	
	public CarInsuranceNavigation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//i[@class='arrow']") 
	WebElement click;
	@FindBy(xpath="//a[text()='Car Insurance']") 
	WebElement carInsurance;
	@FindBy(xpath="//span[text()='car? Click here']") 
	WebElement proceed;
	@FindBy(xpath="//*[@id=\"pre-quote\"]/div[2]/div[3]/div[2]/div[2]/div[7]/div[1]") 
	WebElement selectCity;
	@FindBy(xpath="//span[text()='AP13']") 
	WebElement selectRTO; 
	@FindBy(xpath="//span[@class=\"text\"][text()=\"Volkswagen\"]") 
	WebElement brand; 
	@FindBy(xpath="//span[@class=\"text\"][text()=\"TIGUAN\"]") 
	WebElement model;
	@FindBy(xpath="//span[text()='Diesel']") 
	WebElement fuel;
	@FindBy(xpath="//label[@data-id=\"3517\"]") 
	WebElement varient;
	@FindBy(xpath="//input[@type='text'][@id='txtName']") 
	WebElement name;
	@FindBy(xpath="//input[@id='txtEmail']") 
	WebElement errorEmail;
	@FindBy(xpath="//div[@class=\"button btnOrange\"][text()=\"View Prices \"]")
	WebElement clickEnter;
	@FindBy(xpath="//div[text()='Please enter valid email address']") 
	WebElement errorMessage;
	
	//Action Methods
	public void NavigateBack() throws InterruptedException {
		driver.navigate().to("https://www.policybazaar.com/");
		   Thread.sleep(1000);
		
	}
	public void clickMenu() {
		
		JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   
		   js9.executeScript("arguments[0].click()", click);
		
	}
	public void clickCarInsurance() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor js10 = (JavascriptExecutor)driver;
		   
		   js10.executeScript("arguments[0].click()", carInsurance);
	     //carInsurance.click();
	}
	public void clickProceed() throws InterruptedException
	{
		proceed.click();
		Thread.sleep(2000);
	}
	public void clickCityName() throws InterruptedException
	{
		JavascriptExecutor js11 = (JavascriptExecutor)driver;
		
		   js11.executeScript("arguments[0].click()", selectCity);
		   Thread.sleep(2000);
		//city.click();
	}
	public void clickRTO() throws InterruptedException
	{
		JavascriptExecutor js12 = (JavascriptExecutor)driver;
		js12.executeScript("arguments[0].click()", selectRTO);
		//selectRTO.click();
		 Thread.sleep(2000);
	}
	public void clickCarBrand() throws InterruptedException
	{
		JavascriptExecutor js13 = (JavascriptExecutor)driver;
		js13.executeScript("arguments[0].click()", brand);
		//brand.click();
		 Thread.sleep(2000);
	}
	public void clickCarModel() throws InterruptedException
	{
		model.click();
		 Thread.sleep(2000);
	}
	public void clickFuelType() throws InterruptedException
	{
		fuel.click();
		 Thread.sleep(2000);
	}
	public void clickVarient() throws InterruptedException
	{
		varient.click();
		 Thread.sleep(2000);
	}
	public void EnterAnyName() throws InterruptedException
	{
		name.sendKeys("Nandini Koyala");
		Thread.sleep(2000);
	}
	public void EnterIncorrectEmail() throws InterruptedException
	{
		errorEmail.sendKeys("abc@");
		 Thread.sleep(2000);
	}
	public void clickEnterButton() throws InterruptedException {
		clickEnter.click();
		 Thread.sleep(2000);
		
	}
	public void PrintErrorMessage() throws IOException, InterruptedException {
		
		System.out.println(errorMessage.getText());
		 Thread.sleep(2000);
		 Excel.setcelldata("Sheet1",errorMessage.getText() , 2, 0);
		
	}


}
