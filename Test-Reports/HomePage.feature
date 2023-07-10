Feature: Verifying user able to Upload The HPCL post and HP News link


#Background: 
#	Given User is already logged into the application by giving email as "31982600" and password as "abcd"
#	
#	
#	Scenario: Verifying user able to Click the Upload link and select required dropdown
#	Given User is on HomePage
#	Then User abel to click on Uploadlink
#	Then User abel to select the required dropdown as HP_Post 
#	Then User able to Navigates to HPCL Post Page 
	 
	
	#Scenario: Verifying Admin user able to Click the Admin link and select required dropdown
	#Given User admin is on  admin HomePage by giving username as "31982600" and password as "abcd"
	#Then admin abel to select the required dropdown as status report
	#Then admin able to Navigates to HPCL status report page
	
	Scenario: Verifying Admin user able to approve and publish the post
	Given  User is already logged into the application by giving email as "31982600" and password as "abcd"
	When Admin is on status report page select the right mark 
	Then admin enter the status as "approved" and select the submit button
	Then admin able to check wether report is approved and published 
	
	
	
	
	
	
	
	
	
	
	
	