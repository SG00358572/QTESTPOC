package Auto.AutomationPOC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)

@CucumberOptions(	features = "src/test/java/Auto/AutomationPOC/Features", 
					glue = { "Auto.AutomationPOC.StepDefinations" }, 
					//tags = "BVT",
					plugin = { //"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",   
							"pretty", //"html:target/cucumber-html-report", "html:target/site/cucumber-reports",
							   //"com.epam.reportportal.cucumber.ScenarioReporter",
							   "json:target/cucumber.json",
							   "junit:target/cucumber.xml",
							   
							   },
					dryRun = false,
					
					monochrome = true
)

public class TestRunner {

	
	
}

