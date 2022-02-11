package com.pom.example;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
tags = {"@bbc"},
//plugin = {"pretty", "com.pom.StepReporter"},
dryRun = false,
glue = { "StepDefinition" }

		)
public class Runner {


}
