package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.InsurancePlans;

public class TestCase_003_HealthInsurance extends BaseClass {
	@Test(priority = 18,groups = {"smoke Test Three"})
	public void NavigateHome() throws InterruptedException {
		InsurancePlans NavigatingHome = new InsurancePlans(driver);
		NavigatingHome.NavigateHome();
		
	}
	
	@Test(priority = 19,groups ={"regression Test Three"},dependsOnGroups = {"smoke Test Three"})
	public void HealthInsurancePage() {
		InsurancePlans planDetails = new InsurancePlans(driver);
		logger.info("Getting the list of Insurance Product Plans ");
		planDetails.clickInsuranceProducts();
	
	}
	@Test(priority = 20,groups ={"regression Test Three"})
	public void DisplayList() throws IOException {
		InsurancePlans planDetails = new InsurancePlans(driver);
		logger.info("Getting the list of Insurance Product Plans ");
		planDetails.healthInsuranceProducts();
	}

}
