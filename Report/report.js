$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "To Test the booking functionality of Adactin application",
  "description": "",
  "id": "to-test-the-booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 187621,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "wewewe",
  "description": "",
  "id": "to-test-the-booking-functionality-of-adactin-application;wewewe",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Sign in the Adactin page using valid credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"harshansti\" usernamefield",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"1234567\" in password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.sign_in_the_Adactin_page_using_valid_credentials()"
});
formatter.result({
  "duration": 8795515187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "harshansti",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_usernamefield(String)"
});
formatter.result({
  "duration": 180499686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_password(String)"
});
formatter.result({
  "duration": 65785773,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_login_button()"
});
formatter.result({
  "duration": 1988879309,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_logged_in()"
});
formatter.result({
  "duration": 40870,
  "status": "passed"
});
formatter.after({
  "duration": 90629,
  "status": "passed"
});
formatter.before({
  "duration": 29343,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "The user checks the search function using valid credentials",
  "description": "",
  "id": "to-test-the-booking-functionality-of-adactin-application;the-user-checks-the-search-function-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User is logged in and is in the booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User selects an available option in the Location dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User selects an available option in the Hotel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects an available option in the Roomtype dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects an available option in the number of rooms dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects the available option in the Adults per room field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User selects the available option in the children per room field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User confirms that the search is carried out succesfully",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "The user checks the details entered are displayed correctly and then clicks on select button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "After checking the user clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "The user confirms that the confirmation is succesfull",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_logged_in_and_is_in_the_booking_page()"
});
formatter.result({
  "duration": 50945,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_an_available_option_in_the_Location_dropdown()"
});
formatter.result({
  "duration": 93772062,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_an_available_option_in_the_Hotel_dropdown()"
});
formatter.result({
  "duration": 80414126,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_an_available_option_in_the_Roomtype_dropdown()"
});
formatter.result({
  "duration": 76190669,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_an_available_option_in_the_number_of_rooms_dropdown()"
});
formatter.result({
  "duration": 77540123,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_available_option_in_the_Adults_per_room_field()"
});
formatter.result({
  "duration": 76095282,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_available_option_in_the_children_per_room_field()"
});
formatter.result({
  "duration": 75558651,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 1598851500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_that_the_search_is_carried_out_succesfully()"
});
formatter.result({
  "duration": 31464,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_checks_the_details_entered_are_displayed_correctly_and_then_clicks_on_select_button()"
});
formatter.result({
  "duration": 47537040,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.after_checking_the_user_clicks_on_continue_button()"
});
formatter.result({
  "duration": 1685859201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_confirms_that_the_confirmation_is_succesfull()"
});
formatter.result({
  "duration": 38857,
  "status": "passed"
});
formatter.after({
  "duration": 39812,
  "status": "passed"
});
formatter.before({
  "duration": 39351,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "The user checks the booking function using valid credentials",
  "description": "",
  "id": "to-test-the-booking-functionality-of-adactin-application;the-user-checks-the-booking-function-using-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "The booking page is partially auto populated and the rest dropdowns are to be filled",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters \"Ross\" in the name field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User enters \"Geller\" in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User enters \"12, Eagle creek, Bannock, Montana\" in the address field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enters \"4567128980568056\" in the credit card field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User selects the available option in the credit card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User selects the available options in expiry date dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters \"756\" in the cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User clicks the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "The user confirms that the booking is confirmed and is navigated to the confirmation acknowledgement page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "The user checks the details given are displayed correctly and then clicks on logout button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "The user is navigated back to login page succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_booking_page_is_partially_auto_populated_and_the_rest_dropdowns_are_to_be_filled()"
});
formatter.result({
  "duration": 91747,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ross",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_name_field(String)"
});
formatter.result({
  "duration": 60462182,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Geller",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_last_name_field(String)"
});
formatter.result({
  "duration": 54805262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12, Eagle creek, Bannock, Montana",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_address_field(String)"
});
formatter.result({
  "duration": 110249914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4567128980568056",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_credit_card_field(String)"
});
formatter.result({
  "duration": 78539744,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_available_option_in_the_credit_card_type_dropdown()"
});
formatter.result({
  "duration": 79151088,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_available_options_in_expiry_date_dropdown()"
});
formatter.result({
  "duration": 150282260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "756",
      "offset": 13
    }
  ],
  "location": "StepDefinition.user_enters_in_the_cvv_field(String)"
});
formatter.result({
  "duration": 47436675,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_book_now_button()"
});
formatter.result({
  "duration": 43985526,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_confirms_that_the_booking_is_confirmed_and_is_navigated_to_the_confirmation_acknowledgement_page()"
});
formatter.result({
  "duration": 4002238190,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_checks_the_details_given_are_displayed_correctly_and_then_clicks_on_logout_button()"
});
formatter.result({
  "duration": 597438199,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_is_navigated_back_to_login_page_succesfully()"
});
formatter.result({
  "duration": 1877030,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[ ]\u003e\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\n\tat com.Adactin.stepdefinition.StepDefinition.the_user_is_navigated_back_to_login_page_succesfully(StepDefinition.java:203)\n\tat ✽.Then The user is navigated back to login page succesfully(src/test/java/com/Adactin/feature/Adactin.feature:36)\n",
  "status": "failed"
});
formatter.after({
  "duration": 30259,
  "status": "passed"
});
});