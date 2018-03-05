package step_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by palak on 11/2/16.
 */
public class MyStepdefs {
    int a, b, sum = 0;
    @Given("^I have variable \"([^\"]*)\"$")
    public void iHaveVariable(String arg0) {
        a = Integer.parseInt(arg0);
    }

    @And("^I have another variable \"([^\"]*)\"$")
    public void iHaveAnotherVariable(String arg0) {
        b = Integer.parseInt(arg0);
    }

    @When("^I add them$")
    public void iAddThem() {
        sum = a + b;
    }

    @Then("^I display the sum$")
    public void iDisplayTheSum() {
        System.out.println("Sum of : " + a +" + " + b +" = "+sum);
    }
}
