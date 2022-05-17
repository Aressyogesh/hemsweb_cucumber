Feature: To validate Create Work Order functionality 
@Smoke 
Scenario Outline: Add Work Order 
	When User enters Username <username> 
	And User enters Password <password> 
	And Click on Login 
	Then Page title should be "Dashboard" 
	And Click WO link
	Then Page title should be "Work Order"
	And Click Add Work Order link
	And Select Department
	Examples: 
		|username|password|
		|admin	 |super	  |
		