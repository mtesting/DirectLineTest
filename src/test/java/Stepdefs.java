import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.DirectLineTest;

public class Stepdefs {

    DirectLineTest tests = new DirectLineTest();
    @Given("^the user is navigated to the Insurance Portal$")
    public void the_user_is_navigated_to_the_Insurance_Portal() throws Throwable {
      tests.launchPortal();
    }

    @When("^the user enters the vehicle \"([^\"]*)\"$")
    public void the_user_enters_the_vehicle(String vehRegNum) throws Throwable {
        tests.enterRegNmber(vehRegNum);
    }
    @When("^the user clicks on Find vehicle button$")
    public void the_user_clicks_on_Find_vehicle_button() throws Throwable {
        tests.findVehicle();
    }
    @Then("^the user gets the results back$")
    public void the_user_gets_the_results_back() throws Throwable {

    }
}
