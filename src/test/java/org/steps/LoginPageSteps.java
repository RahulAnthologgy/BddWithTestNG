package org.steps;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import io.cucumber.java.en.*;

import static org.impl.AppAccess.appAccess;
import static org.pages.LoginPage.*;

public class LoginPageSteps {

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        appAccess("https://qa3.conqa.askadmissionsqa.net/admin");
    }
    @When("Enter {.*} and {.*}")
    public void enter_username_and_password(String username,String password) {
        // Write code here that turns the phrase above into concrete actions
        enterUsername(username);
        enterPassword(password);
    }
    @When("Click on Login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        clickOnLogin();
    }
    @Then("Navigate to Home Page")
    public void navigate_to_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }
}
