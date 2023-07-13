package StepDefinitions;

import org.junit.Assert;

import PageObjects.AdminHomePage;
import PageObjects.AdminLoginPage;
import QA.DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminHomePage_Step {

	@Given("Admin is on  admin HomePage by giving username as {string} and password as {string}")
	public void admin_is_on_admin_home_page_by_giving_username_as_and_password_as(String email, String password) {
		AdminLoginPage AdminLoginPage = new AdminLoginPage(DriverFactory.getDriver());
		
		AdminLoginPage.AdminLogin(email, password);
	}

	@Then("Admin able to move admin link and select the status report link")
	public void admin_able_to_move_admin_link_and_select_the_status_report_link() {
		AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
		AdminHomePage.SelectStatus_report();
	}

	@Then("Admin able to Navigates to HP_Radar status report page")
	public void admin_able_to_navigates_to_hp_radar_status_report_page() {

		AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
		boolean targetpage = AdminHomePage.StatusReportPageExist();

		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" Admin is on StatusReportPage ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" Admin is not able to navigate to StatusReportPage  ");
		}

	}
	
	
	
	public  void loginsetup(String email,String password)
	{
		AdminLoginPage AdminLoginPage = new AdminLoginPage(DriverFactory.getDriver());
		AdminLoginPage.AdminLogin(email, password);
		
}
	

}
