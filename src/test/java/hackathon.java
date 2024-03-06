import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hackathon {

	public static void main(String[] args) throws InterruptedException, IOException {
		 // TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.policybazaar.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));		
		
		 //travel insurance
		 driver.findElement(By.xpath("//i[@class=\"icon-bg homeIconsBg icon-bg-new ti\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"favourite-country\"]/li[5]/picture/img"));
        
         //destinations
         driver.findElement(By.xpath("//*[@id=\"favourite-country\"]/li[4]/p")).click();
         driver.findElement(By.cssSelector("button.travel_main_cta")).click();
         Thread.sleep(1000);
         
         //trip dates
         DateTimeFormatter date=DateTimeFormatter.ofPattern("dd MMMM, yyyy");
         String future_date=LocalDate.now().format(date);
         WebElement start_date=driver.findElement(By.xpath("(//input)[1][@class=\"MuiInputBase-input MuiOutlinedInput-input\"]"));
         start_date.sendKeys(future_date);
         start_date.sendKeys(Keys.ESCAPE);
         
         String date2=LocalDate.now().plusDays(15).format(date);
         WebElement end_date=driver.findElement(By.xpath("(//input)[2][@class=\"MuiInputBase-input MuiOutlinedInput-input\"]"));
         end_date.sendKeys(date2);
         end_date.sendKeys(Keys.ESCAPE);
         
         //Travelers
         driver.findElement(By.cssSelector(".travel_main_cta")).click();
         driver.findElement(By.xpath("//label[@for=\"traveller_2\"]")).click();
         driver.findElement(By.xpath("//div[text()=\"Select age of traveller 1\"]")).click();
         driver.findElement(By.xpath("//label[text()=\"22 years\"]")).click();
         driver.findElement(By.xpath("//div[text()=\"Select age of traveller 2\"]")).click();
         driver.findElement(By.xpath("//label[text()=\"21 years\"]")).click();
         driver.findElement(By.cssSelector(".travel_main_cta")).click();
         
         //medical history
         driver.findElement(By.xpath("//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[2]"));
         driver.findElement(By.xpath("//input[@id=\"ped_no\"]")).click();
         Thread.sleep(5000);
         //contact details
         driver.findElement(By.xpath("//input[@inputmode=\"numeric\"][@type=\"text\"]")).sendKeys("9603836054");
         driver.findElement(By.cssSelector(".travel_main_cta")).click();
         Thread.sleep(5000);
         
         //plan type
         driver.findElement(By.xpath("//*[@id=\"studentTrip\"]")).click();
         driver.findElement(By.xpath("//*[@for='Traveller_1']")).click();
         driver.findElement(By.xpath("//*[@for='Traveller_2']")).click();
         WebElement drpdown_duration=driver.findElement(By.xpath("//*[@id=\"feet\"]"));
         drpdown_duration.click();
         Select drpdown=new Select(drpdown_duration);
         drpdown.selectByValue("1");
         driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
         Thread.sleep(1000);
         
         
         //sort by
         driver.findElement(By.xpath("//p[@class='filter_name_heading']")).click();
         driver.findElement(By.xpath("//input[@id='17_sort']")).click();
         
         List<WebElement> plans=driver.findElements(By.xpath("//p[@class=\"quotesCard--insurerName\"]"));
         System.out.println("List of three lowest international travel insurance plans with insurance provider company names and their amount:");
         for(int i=0;i<3;i++) {
        	
        	System.out.println( plans.get(i).getText());
         }
         
         List<WebElement> amts=driver.findElements(By.xpath("//span[@class='premiumPlanPrice']"));
         List<WebElement> amounts=new ArrayList<WebElement>(amts);
        
         for(int i=0;i<3;i++) {
            
             System.out.print(amounts.get(i).getText()+ "\t");
         }
         System.out.println();
         Thread.sleep(5000);
         
         //car insurance
         driver.navigate().to("https://www.policybazaar.com/");
         driver.findElement(By.xpath("//*[@class=\"prd-row\"]//div[4]")).click();
         driver.findElement(By.cssSelector(".btn-proceed")).click();
         
         //select city & RTO
         driver.findElement(By.xpath("//span[@id=\"spn10\"]")).click();
         driver.findElement(By.xpath("//span[text()=\"AP12\"]")).click();
         
         //select car brand
         driver.findElement(By.xpath("//span[@class=\"volkswagen\"]")).click();
         
         //select car model
         driver.findElement(By.xpath("//b[text()=\"TIGUAN\"]")).click();
         
         //Select Car Fuel Type
         driver.findElement(By.xpath("//b[text()=\"Diesel\"]")).click();
         
         //Select Car Variant
         driver.findElement(By.xpath("//b[text()=\"Comfortline TDI (1968 cc)\"]")).click();
         
         //Please Fill Your Details
         driver.findElement(By.xpath("//input[@type=\"text\"][@id=\"name\"]")).sendKeys("Nandini Koyala");
         driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@");
         
         //printing error message
         WebElement error_msg=driver.findElement(By.xpath("//div[@class=\"msg-error show\"]"));
         System.out.println(error_msg.getText());
         
         //screenshot of error message
         TakesScreenshot invalid_email=(TakesScreenshot)driver;
         File src=invalid_email.getScreenshotAs(OutputType.FILE);
         File trg=new File("C:\\Users\\2303766\\eclipse-workspace\\Hackathon\\src\\screenshots\\invalidEmail.png");
         FileUtils.copyFile(src, trg);
         Thread.sleep(2000);
         
         //health insurance menu items
         driver.navigate().to("https://www.policybazaar.com/");
         WebElement prod=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/ul/li[2]/a"));
         Actions actions=new Actions(driver);
         actions.moveToElement(prod).perform();
         
         List<WebElement> healthins=driver.findElements(By.xpath("//div[@class='ruby-col-3 hidden-md'][2]/ul/li"));
         System.out.println("List of all Health Insurance menu items:");
         
         for(int i=0;i<healthins.size();i++) {
        	 System.out.println(healthins.get(i).getText());
         }

         	driver.quit();
	}

}
