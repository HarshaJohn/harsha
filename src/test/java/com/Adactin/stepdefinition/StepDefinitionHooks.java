package com.Adactin.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionHooks {

	
	@Before
	public void beforeHooks(Scenario scene) {
		System.out.println("before Hooks");
		System.out.println("Scenario name is"+scene.getName());
		
	}
	
	@After
	public void afterHooks(Scenario scene) {
		System.out.println("after Hooks");
		System.out.println(scene.getStatus());
		
	}
	
	
}
