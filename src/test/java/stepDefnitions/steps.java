package stepDefnitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testCases.BaseClass;
import testCases.TestCase_001_StudentInsuranceNavigation;
import testCases.TestCase_002_CarInsurance;
import testCases.TestCase_003_HealthInsurance;

public class steps {
	BaseClass setupclass = new BaseClass();
	public WebDriver driver;
	TestCase_001_StudentInsuranceNavigation Details = new TestCase_001_StudentInsuranceNavigation();
	TestCase_002_CarInsurance navigateBack = new TestCase_002_CarInsurance();
	TestCase_003_HealthInsurance insurance = new TestCase_003_HealthInsurance();
	@Given("User is on the insurance website")
	public void user_is_on_the_insurance_website() throws IOException {
		setupclass.setup("os","chrome");
	    
	    
	}

	@When("User enters the studentInsurance Details")
	public void user_enters_the_student_insurance_details() throws InterruptedException, IOException {
		
		Details.VerifyInsurance();
		Details.EnterDetails1();
		Details.EnterDetails2();
		Details.EnterDetails3();
		Details.EnterDetails4();
		Details.EnterDetails5();
		Details.EnterDetails6();
		Details.EnterDetails7();
		Details.EnterDetails8();
	    
	}

	@Then("Display the Top {int} Lowest Insurance Plans")
	public void display_the_top_lowest_insurance_plans(Integer int1) throws InterruptedException, IOException {
		
		Details.InsurancePlans();
	    
	}

	@Given("User navigates to car insurance Page")
	public void user_navigates_to_car_insurance_page() throws InterruptedException {
		
		navigateBack.NavigatingBack();	    
		
	}

	@When("User provides car Insurance Details")
	public void user_provides_car_insurance_details() throws InterruptedException, IOException {
		
		navigateBack.CarInsurancePage();
		navigateBack.CarInsurancePage2();
		navigateBack.CarInsurancePage3();
		navigateBack.CarInsurancePage4();
	    
	}

	@Then("Display the Error Message")
	public void display_the_error_message() throws IOException, InterruptedException {
		
		navigateBack.displayErrorMessage();
		navigateBack.displayErrorMessage2();
	   
	}

	@Given("User Navigates to HomePage")
	public void user_navigates_to_home_page() throws InterruptedException {
		
		insurance.NavigateHome();
	    
	}

	@When("User clicks on Insurance Products")
	public void user_clicks_on_insurance_products() {
		
		insurance.HealthInsurancePage();
	    
	}

	@Then("Display the List of Insurance Items List")
	public void display_the_list_of_insurance_items_list() throws IOException {
		
		insurance.DisplayList();
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
		setupclass.tearDown();
	   
	}


}
