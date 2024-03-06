package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarInsuranceNavigation;



public class TestCase_002_CarInsurance extends BaseClass {
	@Test(priority = 11,groups = {"smoke Test Two"})
	public void NavigatingBack() throws InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.NavigateBack();
		
	}
	@Test(priority = 12,groups= {"regression Test Two"},dependsOnGroups = {"smoke Test Two"})
	public void CarInsurancePage() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		logger.info("Enter Car Insurance Plans Details");
		navigationDetails.clickMenu();
		navigationDetails.clickCarInsurance();
		navigationDetails.clickProceed();

	}
	@Test(priority = 13,groups= {"regression Test Two"})
	public void CarInsurancePage2() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickCityName();
		navigationDetails.clickRTO();
		}
	@Test(priority = 14,groups= {"regression Test Two"})
	public void CarInsurancePage3() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickCarBrand();
		navigationDetails.clickCarModel();
		}
	@Test(priority = 15,groups= {"regression Test Two"})
	public void CarInsurancePage4() throws InterruptedException, IOException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.clickFuelType();
		navigationDetails.clickVarient();
		}
	
	@Test(priority = 16,groups= {"regression Test Two"})
	public void displayErrorMessage() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
		navigationDetails.EnterAnyName();
		navigationDetails.EnterIncorrectEmail();

	}
	@Test(priority = 17,groups= {"regression Test Two"})
	public void displayErrorMessage2() throws IOException, InterruptedException {
		CarInsuranceNavigation navigationDetails = new CarInsuranceNavigation(driver);
	    navigationDetails.clickEnterButton();
		navigationDetails.PrintErrorMessage();
		logger.info("Error message Printed");
		
	}
	

}
