package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement add;
	
	@FindBy(id = "cc_num")
	private WebElement cred;
	
	@FindBy(id = "cc_type")
	private WebElement credtyp;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement bknw;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement log;

	
	public BookPage(WebDriver ldriver ) {
		
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCred() {
		return cred;
	}

	public WebElement getCredtyp() {
		return credtyp;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBknw() {
		return bknw;
	}

	public WebElement getLog() {
		return log;
	}
	
	
	
	
	
	
	
	
	
	
}

    