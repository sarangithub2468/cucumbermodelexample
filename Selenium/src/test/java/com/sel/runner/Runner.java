package com.sel.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources",
  				 glue = "com.sel.testcases",
  				 monochrome = true)


public class Runner extends AbstractTestNGCucumberTests
{

}
