package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Baseclass.BaseClasss;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report/failedtestcase.txt", 
glue = "com\\Adactin\\stepdefinition", 
plugin = {"pretty", "html:Report", "com.cucumber.listener.ExtentCucumberFormatter:Report//ReRunReport.html"}, 
monochrome = false, 
dryRun = false, 
strict = true)

public class ReRunner {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver=BaseClasss.browserLaunch("chrome");
	}
	
	
	@AfterClass
	public static void tearDown()  {
		BaseClasss.close();
	}

}