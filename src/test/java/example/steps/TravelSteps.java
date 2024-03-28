package example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TravelSteps {

    @Given("Get Ready to fly")
    public void readyToFly() {
        System.out.println("Steps to fly to Europe");
    }
@When("Fly to Europe")
    public void f_ly_europe(){
    System.out.println("Steps to your safe Travel to Europe");
}
    @Then("Arrive to Europe")
    public void arriveDestination() {
        System.out.println("Steps to reach your final Destination");

    }
}