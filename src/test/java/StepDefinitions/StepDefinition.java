package StepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.java.en.Then;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on NetBanking Landing page$")
    public void user_is_on_NetBanking_Landing_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the Netbanking Landing page");
    }

    @When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username displayed is "+userName);
        System.out.println("Password displayed is "+password);
    }

   /* @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login to Application with username and password");

    }*/

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is populated");
    }

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards displayed "+arg1);
    }

   /* @Then("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("All cards are displayed");
    }*/
}
