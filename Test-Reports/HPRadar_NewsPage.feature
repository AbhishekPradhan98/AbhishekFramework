Feature: Verify user abel to upload HP Radar post


Background: 
	Given User is already logged into the application by giving email as "31929120" and password as "abcd"
	#Then User select the HP Radar Post Link
	
	Scenario: Verify user abel to upload HP Radar News
	Then User abel to click on Uploadlink
	Then User abel to select the required dropdown as HP_Post
	Then User select the HP Radar news Link
	Then User select the Category as "Photograph" 
	Then User able to Choose the file and Upload the the HP Radar News  
	#Then User able to upload the HP Radar News  