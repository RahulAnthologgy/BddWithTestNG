package org.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import static org.impl.AppAccess.*;
import static org.variables.GlobalVariables.*;
import static org.utils.WbdriverUtils.getDriver;
public class CommonSteps {

    @Given("open the browser")
    public void open_the_browser() {
        System.out.println("Open");
        appAccess("https://www.google.com/?gws_rd=ssl");
    }
}
