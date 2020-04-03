package com.POM.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement lctn;
	
	
	@FindBy(id = "hotels")
	private WebElement htl;
	
	@FindBy(id = "room_type")
	private WebElement rtyp;
	
	@FindBy(id = "room_nos")
	private WebElement rnos;
	
	@FindBy(id = "datepick_in")
	private WebElement chkin;
	
	@FindBy(id = "id=\"datepick_out\"")
	private WebElement chkout;
	
	@FindBy(id = "adult_room")
	private WebElement rm1;
	
	@FindBy(id = "child_room")
	private WebElement rm2;
	
	@FindBy(id = "Submit")
	private WebElement sbmt;
	
	@FindBy(id = "radiobutton_0")
	private WebElement rdobtn;
	
	@FindBy(id = "continue")
	private WebElement con;
	
	
	
	public SearchPage(WebDriver ldriver) {
		
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
		
				
	}
	
	
	
	

	public WebElement getLctn() {
		return lctn;
	}

	public WebElement getHtl() {
		return htl;
	}

	public WebElement getRtyp() {
		return rtyp;
	}

	public WebElement getRnos() {
		return rnos;
	}

	public WebElement getChkin() {
		return chkin;
	}

	public WebElement getChkout() {
		return chkout;
	}

	public WebElement getRm1() {
		return rm1;
	}

	public WebElement getRm2() {
		return rm2;
	}

	public WebElement getSbmt() {
		return sbmt;
	}

	public WebElement getRdobtn() {
		return rdobtn;
	}

	public WebElement getCon() {
		return con;
	}
	
	
	
	
	
	
}
