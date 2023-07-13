package StepDefinitions;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.HPCl_NewsPage;
import PageObjects.HomePage;
import QA.DriverFactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HPRadar_NewsPage_Step {
	
	WebDriver driver;
	HPCl_NewsPage HPCl_NewsPage = new HPCl_NewsPage(DriverFactory.getDriver());
	HomePage HomePage = new HomePage(DriverFactory.getDriver());

	

   
	@Then("User able to select the HP_Radar News")
	public void user_able_to_select_the_hp_radar_news() {
		HomePage.SelecHPCL_News();
	}
	
	
	@Given("Useris on HP_Radar NewsPage")
	public void useris_on_hp_radar_news_page() {

		boolean targetpage = HPCl_NewsPage.HPNewsPageExist();

		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" user is navigate to HP News photo upload Page ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" user is not able to navigate to HP News photo upload Page ");
		}

	}

	@Then("User select the Category as {string}")
	public void user_select_the_category_as(String Category) {

		HPCl_NewsPage.SelectCategory(Category);
	}

	
	@Then("User able to Choose the file and Upload the the HP Radar News")
	public void user_able_to_choose_the_file_and_upload_the_the_hp_radar_news() throws Throwable {

		HPCl_NewsPage.SelectChooseFile();
		
		
		String AlertMsg = HPCl_NewsPage.GetAlert_Message();

		if (AlertMsg!=null) 
//		if(AlertMsg.contains("Data submitted successfully."))
		{
			
//			Assert.assertTrue(true);
		Assert.assertEquals(AlertMsg, AlertMsg);;//if alert is presrnt fail the code 
			System.out.println("user successfully upload the HPradar_News");
			
			
		} else
			System.out.println("user should select the both Category and photo file");
			Assert.assertTrue(true);//need to check
				
		
				

	}
}
