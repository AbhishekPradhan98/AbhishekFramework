package StepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

import PageObjects.HPCL_PostPage;
import PageObjects.LogInPage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PHRadar_PostPage_Step {

	HPCL_PostPage HPCL_PostPage = new HPCL_PostPage(DriverFactory.getDriver());

	@Given("Given User is already logged into the application by giving email as {string} and password as {string}")
	public void given_user_is_already_logged_into_the_application_by_giving_email_as_and_password_as(String email,
			String psw) {

		LogInPage LogInPage = new LogInPage(DriverFactory.getDriver());
		LogInPage.setEmail(email, psw);
	}

	@Then("User select the Category as {string} and enter the title of photo as {string}")
	public void SelectCategoryAnd_Phot(String Category, String photo) {

		HPCL_PostPage.SelectCategory(Category, photo);

	}

	@Then("User Abel to click on pluse button to upload the photo as {string}")
	public void UploadPhots(String string) throws Throwable {

		HPCL_PostPage.Addphoto();

	}

	@Then("User should select maximum eight photo")
	public void user_should_select_maximum_eight_photo() throws Throwable {
		
		HPCL_PostPage.Choose_Photos();
	}

	@Then("User should enter the caption of the photo as {string}")
	public void EnterPhotoCaptino(String string) throws Throwable {

		

		HPCL_PostPage.Enterphoto_Caption("Scenery Image");
	}

	@Then("User select the English or Hindi language and enter the correct text in the SearchBox")
	public void EnterTheLanguage() {
		HPCL_PostPage.EnterMultiple_Languages("Enter the correct text in the SearchBox","खोज बॉक्स में शुद्ध पाठ दर्ज करें");

	}

	@Then("User able enter the employee name as {string} for tagging and select the chek box")
	public void TagThepeople(String employee_name) {

		HPCL_PostPage.SlectTag_Pepole(employee_name);

		HPCL_PostPage.SlectTag_CheckBox();

	}

	@Then("User should able to upload the post")
	public void UploadThe_Post() {

		HPCL_PostPage.Slect_UploadBtn();


	
	String AlertMsg = HPCL_PostPage.GetAlert_Message();

	if (AlertMsg!=null) {
		
		System.out.println("Please check the alert message ===>:"+AlertMsg);
		Assert.assertTrue(false);//if alert is presrnt fail the code 
		
	} else
		
		Assert.assertTrue(true);
			System.out.println("user successfully upload the HPradar_post");
	
			

}
}
