package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement Uname;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement pwd;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement lgn;
	
	
	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUname() {
		return Uname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLgn() {
		return lgn;
	}
	
}
	
	

