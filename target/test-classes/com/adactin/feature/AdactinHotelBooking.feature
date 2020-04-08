Feature: Booking hotel in adactin web application 

Background: 

	Given Refresh the page 
	
Scenario Outline: User login to the account using valid username and password 

	Given User launch login page in the addactin web application 
	When User enter the valid username "<username>" in username field 
	And User enter the valid password "<password>" in password field 
	Then User click on the login button and verfiy the home page was loged in succesfully 
	
	Examples: 
		|username|password|
		|manomala|Maran@3718|
		|hari96|hariharan|
		|hariharan96|hariharan@96|		
		
Scenario: User search for the hotels 

	When User select the location of the hotel 
	And User select the hotel in the hotels list 
	And User select the room type from the list 
	And User select the no of rooms 
	And User enter the date of Check-In 
	And User enter the Check-Out Date 
	And User select the Adult count in the Adult per room field 
	And User select the Children count 
	Then User click on the Search button and verify the hotel list displayed as per our search criteria 

Scenario: User select the hotel form the search criteria 
	When  User select the hotel from the list 
	Then User click on the Continue button 
	
Scenario: User book the hotel by giving personal details 
	When User enter the firstname "firstName" in First Name field 
	And  User enter the lastname "lastName" in Last Name field 
	And User enter the valid billing address "Test Address" in Billing Address field 
	And User enter the sixteen digit valid credit card number "0123456789123456" in Credit Card No field 
	And User select the type of the credit card "American Express" in Credit Card Type field 
	And User select the expiry month "March" in card from Expiry Date field 
	And User select the expiry year "2021" in card from Expiry Date field 
	And User enter the valid cvv number "0123" in CVV Number field 
	Then User click on the Book Now button and verify the details in booking confirmation with the actual given details
	
Scenario: User verifies the Booking confimation
	Then User click on the My Itenarary button and verify the Booked Itenarary page
	
	
	
	