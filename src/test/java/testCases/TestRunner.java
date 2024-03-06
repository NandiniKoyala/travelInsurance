package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
		features= {"C:\\Users\\2303766\\OneDrive - Cognizant\\Documents\\hackathon\\src\\test\\resources\\FeatureFile\\Feature.feature"},
			glue="stepDefnitions" ,
			plugin= {"html:Reports/CucumberReport.html",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
			
			
	 
	public class TestRunner {
		
	 
	}

