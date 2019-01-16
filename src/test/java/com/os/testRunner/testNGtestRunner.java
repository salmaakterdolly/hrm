package com.os.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = {"com.os.steps"},
		tags  = {"@Login, @Admin"}
        

)


public class testNGtestRunner extends AbstractTestNGCucumberTests {

}
