package com.CucumberSuite.TetSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classspath:features", plugin = {"pretty","json:target/cucumber-report.json"})
public class CucumberTest {
}
