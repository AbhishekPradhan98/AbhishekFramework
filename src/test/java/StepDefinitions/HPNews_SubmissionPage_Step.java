package StepDefinitions;

import org.testng.Assert;

import PageObjects.AdminHomePage;
import PageObjects.AdminLoginPage;
import PageObjects.HPNews_SubmissionPage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HPNews_SubmissionPage_Step {
	

	AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
	HPNews_SubmissionPage HPNews_SubmissionPage=new HPNews_SubmissionPage(DriverFactory.getDriver());
	
	@When("Admin is on HomePage and Select HP News Submission link")
	public void admin_is_on_home_page_and_select_hp_news_submission_link() {
		AdminHomePage.SelectHP_News_Submission();
		
	}

	@When("Admin is on HP News Submissions report page")
	public void admin_is_on_hp_news_submissions_report_page() {
		
		
		
		boolean targetpage=HPNews_SubmissionPage.HPNewsPageExist();
		
		if (targetpage) {

			Assert.assertTrue(true);
			System.out.println(" Admin is navigate to HP News Submissions Page ");
		} else {

			Assert.assertTrue(false);
			System.out.println(" Admin is not able to navogate to HP News Submissions  ");
		}

		
	}

	@Then("admin is able to see the HP News submitted by user")
	public void admin_is_able_to_see_the_hp_news_submitted_by_user() {
		
		HPNews_SubmissionPage.EnterSearchBox("Photograph");
		
		String Name=HPNews_SubmissionPage.GetCategory();
		
		if(Name.equals("Photograph"))
		{
			
			Assert.assertEquals("Photograph","Photograph");
		}else
		{
			Assert.assertEquals(false,"Category Name Not Matched As upload by the user");
		}
		
		String details=HPNews_SubmissionPage.Get_HPnewsDetails();
		
//		System.out.print("Categoryt+details");
		
		System.out.print(Name + "\t" + details);
	
	
	}
		
		
//		
//		HPNews_SubmissionPage.EnterSearchBox("Article");
//		String CaNmet=HPNews_SubmissionPage.GetCategory();
//		//String Name=HPNews_SubmissionPage.GetUpladName();
//		Assert.assertEquals(CaNmet, CaNmet);
//		System.out.println(HPNews_SubmissionPage.Get_HPnewsDetails());
		
				
	   
	}
	


