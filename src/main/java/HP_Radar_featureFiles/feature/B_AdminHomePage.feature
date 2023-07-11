Feature: Verifying user able to Upload The HPCL post and HP News link


Background: 
	Given User is already logged into the application by giving email as "31982600" and password as "abcd"
#	Then Admin able to move admin link and select the status report link


#	Scenario: Verifying Admin user able to Click the Admin link and select required dropdown
#	Given Admin is on  admin HomePage by giving username as "31982600" and password as "abcd"
#	Then Admin able to move admin link and select the status report link
#	Then Admin able to Navigates to HP_Radar status report page

 
	Scenario: Verifying Admin user able to approve and publish the post
	Then Admin able to move admin link and select the status report link
#	When Admin is on status report page select the recored
	Then Admin enters the status as "Approved" and selects the submit button
	Then Admin is able to check whether the report is approved and published 




	Scenario: Verifying Admin user able to unpublished the report successfully
	Then Admin able to move admin link and select the status report link
#	When Admin is on status report page select the recored
	Then Admin enters the status as "Unpublish" and Selects the submit button
	Then Admin is able to check whether the report is unpublished successfully
	

	Scenario: Verifying Admin user able to Rejected the report is rejected successfully
	Then Admin able to move admin link and select the status report link
#	When Admin is on status report page select the recored
	Then Admin enters the Status as "Rejected" and selects the submit button
	Then Admin is able to check whether the report is rejected successfully

	

#	Scenario: Verifying Admin user able to approve and publish the post
#	Given Admin is already logged into the application by giving email as "31982600" and password as "abcd"
#	When Admin is on HomePage and Select HP News Submission link
#	When Admin is on HP News Submissions report page
#	Then admin is able to see the HP News submitted by user
	
	
	
	
	
	
#	@HP_Senior_League_Videos @Smoke
#	Scenario: Verifying Admin user is able to upload HP Senior League Videos or not 
#	When Admin is on HomePage and Select  HP Senior League Videos link
#	When Admin is on HP Senior League Page
#	Then User to select month as "January" and year as "2020"
#	And User able to enter the employee name as "Sudesh kumar" and the Designation as "Sr. Manager"
#	And Uesr able to enter the location as "Hyderabad" and  enter the priority as "3"
#	And user able to choose file and click on upload
#	Then User is able to see the alert message	Then User should see alert message saying that "Data inserted successfully"
#
#
#	Scenario: Verifying Admin user is able to upload HP Senior League Videos or not 
#	When Admin is on HomePage and Select  HP Senior League Videos link
#	When Admin is on HP Senior League Page
#	Then User to select month as "January" and year as "2020"
#	And User able to enter the employee name as "Sudesh kumar" and the Designation as "Sr. Manager"
#	And Uesr able to enter the location as "Hyderabad" and  enter the priority as "3"
#	And user able to choose file and click on upload
#	Then User is able to see the alert message
#	
	
	
	
	
	
	
	
	
	
	
	
	