package com.Adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Adactin.Baseclass.BaseClasss;
import com.Adactin.helper.FileReaderManager;
import com.Adactin.helper.PageObjectManager;
import com.Adactin.runner.AdactinRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClasss {

	public static WebDriver driver = AdactinRunner.driver;

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^Sign in the Adactin page using valid credentials$")
	public void sign_in_the_Adactin_page_using_valid_credentials() throws IOException, InterruptedException {

		naviTo("https://adactin.com/HotelApp/index.php");
		maxim();
		Thread.sleep(4000);

	}

	@When("^user enters \"(.*?)\" usernamefield$")
	public void user_enters_usernamefield(String usrname) throws Throwable {
		sendText(pom.getLp().getUname(), usrname);

	}

	@When("^user enters \"(.*?)\" in password$")
	public void user_enters_in_password(String pwd) throws Throwable {
		sendText(pom.getLp().getPwd(), pwd);
		// sendText(pom.lp.getUname(), "harshansti");
		// sendText(pom.lp.getPwd(), "1234567");

	}

	@When("^User clicks login button$")
	public void user_clicks_login_button() {
		clicks(pom.getLp().getLgn());
		// clicks(pom.getLp().getLgn());

	}

	@Then("^User is logged in$")
	public void user_is_logged_in() {
		System.out.println("login successful");

	}

	@Given("^User is logged in and is in the booking page$")
	public void user_is_logged_in_and_is_in_the_booking_page() {
		System.out.println("navigated to search page");

	}

	@When("^User selects an available option in the Location dropdown$")
	public void user_selects_an_available_option_in_the_Location_dropdown() {
		dropDown(pom.getSp().getLctn(), "text", "Sydney");

	}

	@When("^User selects an available option in the Hotel dropdown$")
	public void user_selects_an_available_option_in_the_Hotel_dropdown() {
		dropDown(pom.getSp().getHtl(), "text", "Hotel Hervey");

	}

	@When("^user selects an available option in the Roomtype dropdown$")
	public void user_selects_an_available_option_in_the_Roomtype_dropdown() {
		dropDown(pom.getSp().getRtyp(), "text", "Deluxe");

	}

	@When("^User selects an available option in the number of rooms dropdown$")
	public void user_selects_an_available_option_in_the_number_of_rooms_dropdown() {
		dropDown(pom.getSp().getRnos(), "text", "4 - Four");

	}

	@When("^User selects the available option in the Adults per room field$")
	public void user_selects_the_available_option_in_the_Adults_per_room_field() {
		dropDown(pom.getSp().getRm1(), "text", "3 - Three");

	}

	@When("^User selects the available option in the children per room field$")
	public void user_selects_the_available_option_in_the_children_per_room_field() {
		dropDown(pom.getSp().getRm2(), "text", "4 - Four");

	}

	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() {
		clicks(pom.getSp().getSbmt());

	}

	@Then("^User confirms that the search is carried out succesfully$")
	public void user_confirms_that_the_search_is_carried_out_succesfully() {
		System.out.println("search successful");

	}

	@When("^The user checks the details entered are displayed correctly and then clicks on select button$")
	public void the_user_checks_the_details_entered_are_displayed_correctly_and_then_clicks_on_select_button() {
		clicks(pom.getSp().getRdobtn());

	}

	@When("^After checking the user clicks on continue button$")
	public void after_checking_the_user_clicks_on_continue_button() {
		clicks(pom.getSp().getCon());

	}

	@Then("^The user confirms that the confirmation is succesfull$")
	public void the_user_confirms_that_the_confirmation_is_succesfull() {
		System.out.println("confirmation successful");

	}

	@Given("^The booking page is partially auto populated and the rest dropdowns are to be filled$")
	public void the_booking_page_is_partially_auto_populated_and_the_rest_dropdowns_are_to_be_filled() {
		System.out.println("Fill the following after reading carefully");

	}

	@When("^User enters \"(.*?)\" in the name field$")
	public void user_enters_in_the_name_field(String fname) throws Throwable {
		sendText(pom.getBp().getFname(), fname);

	}

	@When("^User enters \"(.*?)\" in the last name field$")
	public void user_enters_in_the_last_name_field(String lname) throws Throwable {
		sendText(pom.getBp().getLname(), lname);

	}

	@When("^User enters \"(.*?)\" in the address field$")
	public void user_enters_in_the_address_field(String add) throws Throwable {
		sendText(pom.getBp().getAdd(), add);

	}

	@When("^User enters \"(.*?)\" in the credit card field$")
	public void user_enters_in_the_credit_card_field(String cc) throws Throwable {
		sendText(pom.getBp().getCred(), cc);

	}

	@When("^User selects the available option in the credit card type dropdown$")
	public void user_selects_the_available_option_in_the_credit_card_type_dropdown() {
		dropDown(pom.getBp().getCredtyp(), "text", "American Express");

	}

	@When("^User selects the available options in expiry date dropdown$")
	public void user_selects_the_available_options_in_expiry_date_dropdown() {
		dropDown(pom.getBp().getMonth(), "text", "March");
		dropDown(pom.getBp().getYear(), "text", "2021");

	}

	@When("^User enters \"(.*?)\" in the cvv field$")
	public void user_enters_in_the_cvv_field(String cvv) throws Throwable {
		sendText(pom.getBp().getCvv(), cvv);

	}

	@When("^User clicks the book now button$")
	public void user_clicks_the_book_now_button() {
		clicks(pom.getBp().getBknw());

	}

	@Then("^The user confirms that the booking is confirmed and is navigated to the confirmation acknowledgement page$")
	public void the_user_confirms_that_the_booking_is_confirmed_and_is_navigated_to_the_confirmation_acknowledgement_page()
			throws InterruptedException {
		System.out.println("booking is successful");
		Thread.sleep(4000);

	}

	@When("^The user checks the details given are displayed correctly and then clicks on logout button$")
	public void the_user_checks_the_details_given_are_displayed_correctly_and_then_clicks_on_logout_button() {
		clicks(pom.getBp().getLog());
	}

	@Then("^The user is navigated back to login page succesfully$")
	public void the_user_is_navigated_back_to_login_page_succesfully() {
		System.out.println("Welcome to adactin. Click here to login");
		browserLaunch("chrome");
		naviTo("https://adactin.com/HotelApp/index.php");
		Assert.assertEquals("", " ");

	}

}