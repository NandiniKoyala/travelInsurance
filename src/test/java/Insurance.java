

import org.testng.annotations.Test;

import utilityMethods.Excel;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 
public class Insurance {
 
	private  WebDriver driver;
	
	@BeforeTest
	 private void setUpDriver() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	 @Test(priority=1)
	private  void navigatetoInsurance() throws InterruptedException {
		driver.get("https://www.policybazaar.com/");
		   driver.findElement(By.xpath("//*[@class=\"icon-bg homeIconsBg icon-bg-new ti\"]")).click();
		   Thread.sleep(2000);
		  WebElement country = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		  country.click();
		  country.sendKeys("France");
		 // country.sendKeys(Keys.ESCAPE);
		   Thread.sleep(2000);
		   WebElement country1 = driver.findElement(By.xpath("//li[text()=\"France\"]"));
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].click()", country1);
    }
	 @Test(priority=2)
	 private  void TripDetails() throws InterruptedException {
		   WebElement next = driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"]"));
		   JavascriptExecutor js1 = (JavascriptExecutor)driver;
		   js1.executeScript("arguments[0].click()", next);
		   Thread.sleep(5000);
		   //WebElement dateField = driver.findElement(By.xpath("//span[text()=\"Start date\"]"));
	    	DateTimeFormatter forDate = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
	    	String futureDate = LocalDate.now().plusDays(2).format(forDate);
	    	WebElement startdate = driver.findElement(By.xpath("(//input)[1][@class=\"MuiInputBase-input MuiOutlinedInput-input\"]"));
            startdate.sendKeys(futureDate);
	    	 startdate.sendKeys(Keys.ESCAPE);
			   Thread.sleep(2000);
	    	String futureDate2 = LocalDate.now().plusDays(32).format(forDate);
	    	WebElement enddate = driver.findElement(By.xpath("(//input)[2][@class=\"MuiInputBase-input MuiOutlinedInput-input\"]"));
	    	enddate.sendKeys(futureDate2);
	    	enddate.sendKeys(Keys.ESCAPE);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"]")).click();
			   Thread.sleep(2000);
			   
    }
	 @Test(priority=3)
	 private  void EnterDetails() throws InterruptedException {
		driver.findElement(By.xpath("//label[@for=\"traveller_2\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[@id=\"0\"][@class=\"customDropdown \"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//label[text()=\"22 years\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[@id=\"1\"][@class=\"customDropdown \"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//label[text()=\"21 years\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"ped_yes\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"ped_yes_traveller_0\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"ped_yes_traveller_1\"]")).click();
		   Thread.sleep(2000);
		   WebElement next2= driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"]"));
		   JavascriptExecutor js2 = (JavascriptExecutor)driver;
		   js2.executeScript("window.scrollBy(0,200)");
		   js2.executeScript("arguments[0].click()", next2);
		   Thread.sleep(5000);
    }
	
	 @Test(priority=4)
	 private void sortDetails() throws InterruptedException {
		 WebElement mobile = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		   mobile.sendKeys("77777888899");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"]")).click();
		   Thread.sleep(2000);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"studentTrip\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"Traveller_1\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"Traveller_2\"]")).click();
		 //div[@class="inputRow select tripDurationInput"]
		   Thread.sleep(2000);
		   WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"feet\"]"));
		   Select drpdwn = new Select(dropdown);
		   drpdwn.selectByValue("1");
		 //button[@class="travel_main_cta"][text()="Apply"]
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[@class=\"travel_main_cta\"][text()=\"Apply\"]")).click();
		   Thread.sleep(2000);
		   WebElement ele = driver.findElement(By.xpath("//p[@class=\"filter_name_heading\"]"));
		   JavascriptExecutor js3 = (JavascriptExecutor)driver;
		   
		   js3.executeScript("arguments[0].click()", ele);
		   Thread.sleep(2000);
		   WebElement ele2 =driver.findElement(By.xpath("//input[@value=\"Premium low to high\"]"));
		   JavascriptExecutor js4 = (JavascriptExecutor)driver;
		   
		   js4.executeScript("arguments[0].click()", ele2);
    }
	 @Test(priority=5)
	 private  void getDetails() throws InterruptedException {
		List<WebElement> company =driver.findElements(By.xpath("//p[@class=\"quotesCard--insurerName\"]"));
		List<String> companyname = new ArrayList<String>();
	   for(int i=0;i<3;i++) {
		   companyname.add(company.get(i).getText());
		   //System.out.println(company);
	   }
	   System.out.println(companyname);
	   List<WebElement> price =driver.findElements(By.xpath("//span[@class=\"premiumPlanPrice\"]"));
	   List<String> prices = new ArrayList<String>();
	   for(int i=0;i<3;i++) {
		   prices.add(price.get(i).getText());
		  // System.out.println(prices);
	   }
	   System.out.println(prices);
    }
	 @Test(priority=6)
	 private  void navigateToCar() throws InterruptedException {
		driver.navigate().to("https://www.policybazaar.com/");
		
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//i[@class=\"arrow\"]")).click();
		  driver.findElement(By.xpath("//a[text()=\"Car Insurance\"]")).click();
//		   driver.findElement(By.xpath("//div[4][@class=\"prd-block\"]")).click();
//		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[text()=\"car? Click here\"]")).click();
		   Thread.sleep(2000);
		   WebElement city = driver.findElement(By.xpath("//div[text()=\"Chennai \"]"));
          JavascriptExecutor js24 = (JavascriptExecutor)driver;
		   
		    js24.executeScript("arguments[0].click()", city);
		   Thread.sleep(2000);
		  //driver.findElement(By.xpath("(//ul)[3]/li")).click();
		   WebElement rt0 = driver.findElement(By.xpath("//label[@data-id=\"903\"]"));
		   js24.executeScript("arguments[0].click()", rt0);
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//li[@class=\"col-sm-3 col-xs-6\"]")).click();
		   driver.findElement(By.xpath("//label[@data-id=\"33\"]")).click();
		   
		   Thread.sleep(2000);
		  // driver.findElement(By.xpath("//li[@class=\"col-sm-6 col-xs-6 \"]")).click();
		   driver.findElement(By.xpath("//label[@data-id=\"222\"]")).click();
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//span[@id=\"Petrol\"]")).click();
		   driver.findElement(By.xpath("//span[text()=\"Petrol\"]")).click();
		   Thread.sleep(2000);
		  // driver.findElement(By.xpath("//li[@class=\"col-sm-6 col-xs-12\"]")).click();
		   driver.findElement(By.xpath("//span[text()=\"Delta AMT\"][@class=\"text\"]")).click();
		   Thread.sleep(5000);
		  // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
    }
	
	 @Test(priority=7)
	 private void getErrormsg() throws InterruptedException, IOException {
//		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("xyz");
		 driver.findElement(By.xpath("//input[@id =\"txtName\"]")).sendKeys("xyz");
		   Thread.sleep(2000);
		   //driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc");
		   driver.findElement(By.xpath("//input[@id =\"txtEmail\"]")).sendKeys("abc");
		   driver.findElement(By.xpath("//div[@class=\"button btnOrange\"][text()=\"View Prices \"]")).click();
		   WebElement errormsg = driver.findElement(By.xpath("//div[text()=\"Please enter valid email address\"]"));
		   //String File = "C:\\Users\\2303757\\eclipse-workspace\\hackathon\\ExcelFile\\outputFile.xlsx";
			//System.out.println(errorMessage.getText());
			//Excel.setCellData(File,"Sheet1",1,1, errormsg.getText());
		   System.out.println(errormsg.getText());
    }
	 @Test(priority=8)
	 private void navigateList() throws InterruptedException {
		driver.navigate().to("https://www.policybazaar.com/");
	       
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class=\"arrow\"]")).click();
         List<WebElement> healthInsurance = driver.findElements(By.xpath("//*[@class=\"ruby-col-3 hidden-md\"][2]/ul/li"));
   
       for(int i=0;i<healthInsurance.size();i++) {
	   
	      System.out.println(healthInsurance.get(i).getText());
       }
 
    }
	 @AfterTest
	private  void closeBrowser() {
        driver.quit();
    }
}
	//popup
	//div[@class="exitIntentPopup__box "]
	//span[@class="exitIntentPopup__box__closePop"]-closing
 
 
 
////span[text()="Start date"]
//input[@class="MuiInputBase-input MuiOutlinedInput-input"] |//span[text()="Start date"]
//*[@class="MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-outlined"]
//button[text()="Proceed to travellers"]
//div[@id="0"][@class="customDropdown "]
//label[text()="22 years"]