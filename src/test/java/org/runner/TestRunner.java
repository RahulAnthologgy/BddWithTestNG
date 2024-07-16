package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src//resources//features", glue = "org.steps",tags="@Login",plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber-reports.json"},monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    TestNGCucumberRunner testng= new TestNGCucumberRunner(this.getClass());
}
