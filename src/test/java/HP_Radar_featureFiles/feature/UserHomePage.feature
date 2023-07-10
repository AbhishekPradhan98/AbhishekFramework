Feature: Verifying user able to Upload The HPCL post and HP News link


Background: 
	Given User is already logged into the application by giving email as "31929120" and password as "abcd"
	Given User is on HomePage
#	Then User select the required dropdown from the below table 
#	|HPRadar_dropdownList|
#	|HPRadar_post|
#	|HPradar_news|
	

	
#@Select_dropdown_List @smoke
#Scenario: Verifying user able to Click the Upload link and select required dropdown
#	Given User is on HomePage
#	Then User able to move upload link and select the HP_Radar Post
#	Then User able to Navigates to HPCL Post Page 
#	 
	
@Upload_HpRadar_Post @Regression @User_Sanity
	Scenario: Verify user abel to upload HP Radar post 
	Then User able to move upload link and select the HP_Radar Post
	Then User select the Category as "Activities" and enter the title of photo as "Green Scenery"
	Then User Abel to click on pluse button to upload the photo as "Scenery.jpg"
	Then User should select maximum eight photo
	Then User should enter the caption of the photo as "Scenery Image"
	Then User select the English or Hindi language and enter the correct text in the SearchBox 
	#Enter the correct text in the SearchBox
	#खोज बॉक्स में शुद्ध पाठ दर्ज करें
	Then User able enter the employee name as "NEHA SACHAN" for tagging and select the chek box 
	#Employee Name (Employee No) - NEHA SACHAN (31929120)
	Then User should able to upload the post

	
#	
	@Upload_Hp_News @Regression @User_Sanity
	Scenario: Verify user abel to upload HP Radar News
	Given User is on HomePage
	Then User able to select the HP_Radar News
	Given Useris on HP_Radar NewsPage
	Then User select the Category as "Photograph" 
	Then User able to Choose the file and Upload the the HP Radar News  

	
	
	
	
	
	
	
	