Feature: Login to HP_Radar application with valid Credentials


	Scenario: user Successfully Login with valid Credentials
		Given user is on login page
		And User Enter Email as "31929120" and password as "abcd"
		And Click on LogIn Button
		Then User navigates to Home Page
		And Verify user able to logout
	

	Scenario: Admin Successfully Login with valid Credentials
		When AdminUser Enter Email as "31982600" and password as "abcd" on LogIn Page
		And Click on LogIn Button
		Then User navigates to Admin Home Page
		And Verify user able to logout the Admin Page