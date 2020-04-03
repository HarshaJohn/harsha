package com.Adactin.helper;

import org.openqa.selenium.WebDriver;

import com.POM.adactin.BookPage;
import com.POM.adactin.LoginPage;
import com.POM.adactin.SearchPage;

public class PageObjectManager {

	public WebDriver driver;

	public BookPage bp;
	public LoginPage lp;
	public SearchPage sp;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}

	public BookPage getBp() {
		bp = new BookPage(driver);
		return bp;
	}

	public SearchPage getSp() {
		sp = new SearchPage(driver);
		return sp;
	}

}
