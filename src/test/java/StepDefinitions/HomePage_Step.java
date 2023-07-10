package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HPCL_PostPage;
import PageObjects.HomePage;
import PageObjects.LogInPage;
import TestBase.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import QA.DriverFactory.*;

public class HomePage_Step {

	WebDriver driver;
	LogInPage LogInPage;
	//HomePage HomePage;
	HPCL_PostPage HPCL_PostPage;
	
	HomePage HomePage=new HomePage(DriverFactory.getDriver());
	

	@Given("User is already logged into the application by giving email as {string} and password as {string}")
	public void user_is_already_logged_into_the_application_by_giving_email_as_and_password_as(String email, String psw) {
		
		
		LogInPage LogInPage=new LogInPage(DriverFactory.getDriver());
		LogInPage.setEmail(email, psw);
	}
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() {
		
		boolean targetpage=HomePage.IsHomePageExists();
		
		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" <---user succssful LogIn and navigate to HomePage--> ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" <---Login Failed user not able to navigate HomePage--> ");
		}
	}
	
	

//@Then("User select the required dropdown from the below table")
//public void user_select_the_required_dropdown_from_the_below_table(DataTable dataTable) {
//	
//	List <Map<String, String>> dropdownlist=(List<Map<String, String>>) dataTable.asMap() ;
//	HPCL_PostPage=HomePage.SelectHPCL_Post();
//	dropdownlist.get(0).get("HPRadar_dropdownList");
//}
	

	
	@Then("User able to move upload link and select the HP_Radar Post")
	public void user_able_to_move_upload_link_and_select_the_hp_radar_post() {
		
		HPCL_PostPage=HomePage.SelectHPCL_Post();
	}
	
	@Then("User able to Navigates to HPCL Post Page")
	public void user_able_to_navigates_to_hpcl_post_page() {
		
		
	   
	}



	

}
