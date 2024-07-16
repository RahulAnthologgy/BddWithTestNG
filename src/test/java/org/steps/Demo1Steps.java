package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.pages.Google.*;
import static org.variables.GlobalVariables.*;
import static org.utils.WbdriverUtils.getDriver;


public class Demo1Steps {

    @And("user is on google page")
    public void user_is_on_google_page() {

        String url=cdriver.getCurrentUrl();
        if(url.equalsIgnoreCase("https://www.google.com/?gws_rd=ssl"))
        { System.out.println("google");
                    }
    }
    @When("user enter {string} in search box")
    public void user_enter_text_in_search_box(String text) {
        System.out.println("enter");
        enterText(text);
        cdriver.findElement(By.xpath("//input[@name='q']")).click();

    }
    @And("click on search button")
    public void click_on_search_button() {
        System.out.println("button");
        enterKeyPress();
    }
    @Then("user is navigate to search results")
    public void user_is_navigate_to_search_results() {
        System.out.println("result");
        //cdriver.findElement(By.xpath("//a[text()='Mobile Phones']")).isDisplayed();
        cdriver.quit();
    }

}
