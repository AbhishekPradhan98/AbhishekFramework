Feature: Verify user abel to upload HP Radar post


Background: 
	Given User is already logged into the application by giving email as "31929120" and password as "abcd"
	#Then User select the HP Radar Post Link
	
	
	Scenario: Verify user abel to upload HP Radar post 
	Then User abel to click on Uploadlink
	Then User abel to select the required dropdown as HP_Post
	Then User select the HP Radar Post Link
	Then User select the Category as"Activities" and enter the title of photo as "Green Scenery"
	Then User Abel to click on pluse button to upload the photo #Photo type is - Scenery.jpg
	Then User should select maximum eight photo
	Then User should enter the caption of the photo #Photo Caption - Scenery Image
	Then User select the English or Hindi language and enter the correct text in the SearchBox 
	#Enter the correct text in the SearchBox
	#खोज बॉक्स में शुद्ध पाठ दर्ज करें
	Then User able enter the employee name as "NEHA SACHAN (31929120)" for tagging and select the chek box 
	#Employee Name (Employee No) - NEHA SACHAN (31929120)
	Then User should able to upload the post
	Then User navigets to HomePage
	
	
	
	
	 

