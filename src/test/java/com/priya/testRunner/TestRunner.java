package com.priya.testRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = { "stepdefinition" },
		monochrome = true,
		plugin= {"pretty","html:target/cucumber-reports"}
		
		//plugin= {"pretty","json:target/cucumber-reports"}
		)
public class TestRunner {}
