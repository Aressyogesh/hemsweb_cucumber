Feature: Validate Login Functionality 
@Regression 
Scenario: Successful Login with Valid Credentials 
#	Given Open Browser and Access URL 
	And User enters Username 
	And User enters Password 
	And Click on Login 
	Then Page title should be "Dashboard" 
	When User click on Logout link 
	#Then Page title should be "Log in"
#	And Close Browser 

@Negative 
Scenario Outline: Login Invalid Cases 
#	Given Open Browser and Access URL 
	When User enters Username <username> 
	And User enters Password <password> 
	And Click on Login 
	Then Error Message should be <errMessage> 
#	And Close Browser 
	
	Examples: 
		|username|password|errMessage					|
		|invalid |super   |Invalid username or password.|
		|admin   |invalid |Invalid username or password.|