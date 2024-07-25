package Auto.AutomationPOC.StepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;

public class StepDefs {	
	

	 @Given("I have two numbers")
	 public void twoNumbers()  {		 
		 System.out.println("Inside twoNumbers...");             	        
	 }
	 @When("I add the numbers")
	 public void addnumbers()  {		 
		 System.out.println("Inside addnumbers...unsuccessfull");
		 
		Assert.fail("Test Step failed adding two numbers");
			
          	        
	 }
	 @When("I substract the numbers")
	 public void substractnumbers()  {		 
		 System.out.println("Inside substract numbers...successfull");
		 
          	        
	 }
	
}
