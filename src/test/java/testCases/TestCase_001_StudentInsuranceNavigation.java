package testCases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import pageObjects.StudentInsuranceNavigation;

import utilityMethods.Calender;

public class TestCase_001_StudentInsuranceNavigation extends BaseClass{
	
	
	
	@Test(priority = 1,groups = {"smoke Test one"})
	public void VerifyInsurance() throws InterruptedException, IOException{
	
		logger.info("starting TestCase_001_StudentInsurance");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		logger.info("Enter Student TravelInsurance Plan Details");
		navigation.clickTravelInsurance();
		navigation.clickCountry();
		navigation.clickCountryName();
		navigation.clickNext1();
	
		}
	@Test(priority = 2,groups = {"regression Test One"},dependsOnGroups = {"smoke Test one"})
	public void EnterDetails1() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.EnterStartDate(Calender.date1());
		navigation.EnterEndDate(Calender.date2());
		navigation.clickNext2();

	}
	@Test(priority = 3,groups = {"regression Test One"})
	public void EnterDetails2() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.clickTravellers();
		navigation.clickTraveller1();
		navigation.selectTraveller1Age();
		navigation.clickTraveller2();
		navigation.selectTraveller2Age();
		navigation.clickNextButton();
	 
	}
	@Test(priority = 4,groups = {"regression Test One"})
	public void EnterDetails3() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.clickNo();	
		
	}
	@Test(priority = 5,groups = {"regression Test One"})
	public void EnterDetails4() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.EnterMobile();
		navigation.clickEnter();
	}
	@Test(priority = 6,groups = {"regression Test One"})
	public void EnterDetails5() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectPlan();
		
	}
	@Test(priority = 7,groups = {"regression Test One"})
	public void EnterDetails6() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectTraveller1CheckBox();
		navigation.selectTraveller2CheckBox();
		
	}
	@Test(priority = 8,groups = {"regression Test One"})
	public void EnterDetails7() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.selectTravelDuration();
		navigation.clickApply();
		
	}
	@Test(priority = 9,groups = {"regression Test One"})
	public void EnterDetails8() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		navigation.sortFilter();
		navigation.clickSortPrice();
		
	}
	@Test(priority = 10,groups = {"regression Test One"})
	public void InsurancePlans() throws InterruptedException, IOException {
		StudentInsuranceNavigation navigation = new StudentInsuranceNavigation(driver);
		
		navigation.printCompanyName();
		navigation.printPrices();
		
	}
	
	
}
