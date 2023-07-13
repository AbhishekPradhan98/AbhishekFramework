package StepDefinitions;

import org.testng.Assert;

import PageObjects.AdminHomePage;
import PageObjects.AdminLoginPage;
import PageObjects.HomePage;
import PageObjects.LogInPage;
import QA.DriverFactory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogin_step {

	LogInPage LogInPage;
	// HomePage HomePage;
	AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
	AdminLoginPage AdminLoginPage = new AdminLoginPage(DriverFactory.getDriver());
	HomePage HomePage = new HomePage(DriverFactory.getDriver());

	@When("AdminUser Enter Email as {string} and password as {string} on LogIn Page")
	public void admin_user_enter_email_as_and_password_as_on_log_in_page(String email, String password) {

		AdminHomePage = AdminLoginPage.AdminLogin(email, password);

	}

	@Then("User navigates to Admin Home Page")
	public void user_navigates_to_admin_home_page() {

		boolean targetpage = AdminHomePage.IsAdminHomepageExist();

		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" <---user succssful LogIn and navigate to Admin HomePage--> ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" <---Login Failed user not able to navigate Admin HomePage--> ");
		}
	}

	@Then("Verify user able to logout the Admin Page")
	public void verify_user_able_to_logout_the_admin_page() {
		AdminLoginPage.ClickOn_LoginBtn();

	}

}
