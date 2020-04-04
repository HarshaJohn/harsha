package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Baseclass.BaseClasss;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//feature//Adactin.feature", 
glue = "com\\Adactin\\stepdefinition", 
plugin = {"pretty", "html:Report", "com.cucumber.listener.ExtentCucumberFormatter:Report//extentReport.html",
		"rerun: Report//failedtestcase.txt"}, 
monochrome = false, 
dryRun = false, 
strict = true)
 

public class AdactinRunner {
	
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
