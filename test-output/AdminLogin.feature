Feature: AdminLogin with valid Credentials

@sanity
	Scenario: Successful Login with valid Credentials
		##Given User Launch browser
		##And Opens URL "http://localhost/opencart/upload/"
		##And Opens URL "http://10.90.170.140/hpcl_grp1/PRCC/index_beforeCA.jsp"
		When AdminUser Enter Email as "31982600" and password as "abcd" on LogIn Page
		And Click on LogIn Button
		Then User navigates to Home Page
		And Verify user able to logout
		
		
		Scenario: 