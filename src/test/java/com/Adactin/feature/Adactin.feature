Feature: To Test the booking functionality of Adactin application

Scenario: wewewe 
Given Sign in the Adactin page using valid credentials
When user enters "harshansti" usernamefield 
And user enters "1234567" in password 
And User clicks login button
Then User is logged in

Scenario: The user checks the search function using valid credentials
Given User is logged in and is in the booking page
When User selects an available option in the Location dropdown
And User selects an available option in the Hotel dropdown
And user selects an available option in the Roomtype dropdown
And User selects an available option in the number of rooms dropdown
And User selects the available option in the Adults per room field
And User selects the available option in the children per room field
And User clicks on search button
Then User confirms that the search is carried out succesfully
When The user checks the details entered are displayed correctly and then clicks on select button
And After checking the user clicks on continue button
Then The user confirms that the confirmation is succesfull

Scenario: The user checks the booking function using valid credentials
Given The booking page is partially auto populated and the rest dropdowns are to be filled
When User enters "Ross" in the name field
And User enters "Geller" in the last name field
And User enters "12, Eagle creek, Bannock, Montana" in the address field
And User enters "4567128980568056" in the credit card field
And User selects the available option in the credit card type dropdown
And User selects the available options in expiry date dropdown
And User enters "756" in the cvv field
And User clicks the book now button
Then The user confirms that the booking is confirmed and is navigated to the confirmation acknowledgement page
When The user checks the details given are displayed correctly and then clicks on logout button
Then The user is navigated back to login page succesfully
