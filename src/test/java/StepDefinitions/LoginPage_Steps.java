package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LogInPage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginPage_Steps {

	static WebDriver driver;

	LogInPage LogInPage;
	HomePage HomePage;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		LogInPage = new LogInPage(DriverFactory.getDriver());
		
	}

	@Test
	@When("User Enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
		

		LogInPage = new LogInPage(BaseClass.driver);

		HomePage = LogInPage.setEmail(email, password);

	}
	
	
	@Test
	@When("Click on LogIn Button")
	public void click_on_log_in_button() throws Throwable {

		//LogInPage.clickLogin();

	}
	
	@Test
	@Then("User navigates to Home Page")
	public void user_navigates_to_home_page() {
		
		Boolean targetpage = HomePage.IsHomePageExists();

		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" User Login is Success ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" user Login is Failed  ");
		}

	}

	
	@Test
	@And("Verify user able to logout")
	public void verify_user_able_to_logout() {
		//HomePage hp = new HomePage(driver);
		HomePage.ClickOnLogOut();

	}

}
