package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoPage;


public class GoogleSteps {
 SauceDemoPage saucedemo = new SauceDemoPage();
 
 @Given("^I am on the google search page$")
 public void navigateToSauce(){
    saucedemo.navigateToSauce();
}

@When("^I enter a search criteria$")
 public void enterSearchCriteria(){
    
 }
@And("^Click on the search button$")
 public void clickOnSearchButton(){
    
 }
@Then("^The results match the criteria$")
 public void resultsMatchWithCriteria(){
    
 }

}
