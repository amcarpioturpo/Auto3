package com.ui.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"com.ui.steps"}
        // glue = {"com.ui.runner", "com.ui.steps"}
)

public class TestRunner {


}
