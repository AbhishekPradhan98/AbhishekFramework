package StepDefinitions;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import PageObjects.AdminHomePage;
import PageObjects.AdminLoginPage;
import PageObjects.HPSeniorLeaguePage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HPSeniorLeaguePage_Step {

	AdminLoginPage AdminLoginPage = new AdminLoginPage(DriverFactory.getDriver());
	AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
	HPSeniorLeaguePage HPSeniorLeaguePage = new HPSeniorLeaguePage(DriverFactory.getDriver());
	SoftAssert sa = new SoftAssert();
	

@When("Admin is on HomePage and Select  HP Senior League Videos link")
public void admin_is_on_home_page_and_select_hp_senior_league_videos_link() {
	AdminHomePage.HPSeniorLeaguePage();
}


	@When("Admin is on HP Senior League Page")
	public void admin_is_on_hp_senior_league_page() {
		
		HPSeniorLeaguePage.HPSeniorLeaguePageExist();

	}

	@Then("User to select month as {string} and year as {string}")
	public void user_to_select_month_as_and_year_as(String month, String year) throws Throwable {
		
		HPSeniorLeaguePage.SetMontAndYear(month, year);

//		HPSeniorLeaguePage.ClickOn_UploadBtn();
//		String alertMsg = HPSeniorLeaguePage.VerifyAlertMsg();
//
//		if (alertMsg.equals("Data inserted successfully")) {
//
//		} else {
//
//			System.out.println(alertMsg);
//
//		}

	}

	@Then("User able to enter the employee name as {string} and the Designation as {string}")
	public void user_able_to_enter_the_employee_name_as_and_the_designation_as(String employee, String Designation) {

		HPSeniorLeaguePage.SetEmpNameAnd_Designation(employee, Designation);

//		HPSeniorLeaguePage.ClickOn_UploadBtn();
//		String alertMsg = HPSeniorLeaguePage.VerifyAlertMsg();
//
//		if (alertMsg.equals("Data inserted successfully")) {
//
//		} else {
//
//			System.out.println(alertMsg);
//
//		}

	}

	@Then("Uesr able to enter the location as {string} and  enter the priority as {string}")
	public void uesr_able_to_enter_the_location_as_and_enter_the_priority_as(String location, String priority) {
		
		HPSeniorLeaguePage.SetLocAnd_Priority(location, priority);

//		HPSeniorLeaguePage.ClickOn_UploadBtn();
//		String alertMsg = HPSeniorLeaguePage.VerifyAlertMsg();
//
//		if (alertMsg.equals("Data inserted successfully")) {
//
//		} else {
//
//			System.out.println(alertMsg);
//
//		}

	}

	@Then("user able to choose file and click on upload")
	public void user_able_to_choose_file_and_click_on_upload() throws AWTException {

		HPSeniorLeaguePage.UploadFile();

		//HPSeniorLeaguePage.ClickOn_UploadBtn();
//		String alertMsg = HPSeniorLeaguePage.VerifyAlertMsg();
//
//		if (alertMsg.equals("Data inserted successfully")) {
//
//		} else {
//
//			System.out.println(alertMsg);
//
//		}
	}

	@Then("User is able to see the alert message")
	public void user_is_able_to_see_the_alert_message() throws AWTException, InterruptedException {
		
		HPSeniorLeaguePage.ClickOn_UploadBtn();

		String alertMsg = HPSeniorLeaguePage.VerifyAlertMsg();
		
		
		if (alertMsg.contains("Data inserted successfully")) 
		{

			Assert.assertTrue(true);
			System.out.println("Admin User Can See the cnoformation Message:"+ alertMsg);

		} else {
			
			System.out.println("Please check the alert message===>:"+alertMsg);

			Assert.assertTrue(false);
			

		}

	}

}
