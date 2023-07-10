package StepDefinitions;

import org.junit.Assert;

import PageObjects.AdminHomePage;
import PageObjects.StatusReportPage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StatusReport_Step {
	
	AdminHomePage AdminHomePage = new AdminHomePage(DriverFactory.getDriver());
	StatusReportPage StatusReportPage = new StatusReportPage(DriverFactory.getDriver());
	
	
	
	@When("Admin is on the status report page and selects the record")
    public void adminSelectsRecord() {
		AdminHomePage.SelectStatus_report();
    }
	
//	Admin_Approved_The_Report
	 
	@Then("Admin enters the status as {string} and selects the submit button")
    public void AdminApproved_TheReport(String Approved)
	{
    	
		StatusReportPage.EnterSearchBox("Green Scenery");
		String Name=StatusReportPage.GetCategory();
		
		if(Name.equals("Green Scenery"))
		{
			
			//Assert.assertEquals("Green Scenery","Green Scenery");
			Assert.assertTrue(true);
			
			StatusReportPage.ApprovedPost(Approved);
			//StatusReportPage.RejectPost(Rejected);
			//StatusReportPage.Unpublish(Unplushed);

		}else
		{
			Assert.assertEquals(false,"Category Name Not Matched Approved is pending");
		}
			
	
    }
	
	//Check_ReportIs_Approved and Published
	
	 @Then("Admin is able to check whether the report is approved and published")
	    public void Approved_Status() {
	    	
	    	String  status=StatusReportPage.GetRejection_Status();
	    	
	    	if(status.equals("Rejected"))
	    	{
	    		System.out.println("No reports are avalible to approved");
	    		Assert.assertTrue(false);
	    		
	    		
	    	}else
	    	{
	    		Assert.assertTrue(true);
	    		
	    	}System.out.println("report is approved and published");
	    }

//	Admin_Reject_The_Report
    @Then("Admin enters the Status as {string} and selects the submit button")
    public void adminEntersStatusAndSubmit(String Rejected) {
    	
		StatusReportPage.EnterSearchBox("Green Scenery");
		String Name=StatusReportPage.GetCategory();
		
		if(Name.equals("Green Scenery"))
		{
			
			//Assert.assertEquals("Green Scenery","Green Scenery");
			Assert.assertTrue(true);
			
			//StatusReportPage.ApprovedPost(Approved);
			StatusReportPage.RejectPost(Rejected);
			//StatusReportPage.Unpublish(Unplushed);

		}else
		{
			Assert.assertEquals(false,"Category Name Not Matched rejection pending");
		}
			
	
    }
    
  //Check_Report Is rejected successfully
    @Then("Admin is able to check whether the report is rejected successfully")
    public void Rejected_Status() {
    	
    	String  status=StatusReportPage.GetRejection_Status();
    	
    	if(status.equals("Rejected"))
    	{
    		System.out.println("report is rejected successfullyed");
    		Assert.assertTrue(false);
    		
    		
    	}else
    	{
    		Assert.assertTrue(true);
    		System.out.println("No reports are avalible to reject");
    	}
    

      
    }
    
//	Admin_Unpublish_The_Report
    @Then("Admin enters the status as {string} and Selects the submit button")
    public void AdminUnpublish_theReport(String Unpublished) {
    	
		StatusReportPage.EnterSearchBox("Green Scenery");
		String Name=StatusReportPage.GetCategory();
		
		if(Name.equals("Green Scenery"))
		{
			
			Assert.assertEquals("Green Scenery","Green Scenery");
			Assert.assertTrue(true);
			
			//StatusReportPage.ApprovedPost(Approved);
			//StatusReportPage.RejectPost(Rejected);
			StatusReportPage.Unpublish(Unpublished);

		}else
		{
			Assert.assertEquals(false,"Category Name Not Matched rejection pending");
		}
			
	
    }

   
    //check whether report is Unpublished successfully

    @Then("Admin is able to check whether the report is unpublished successfully")
    public void Unpublished_Status() {
    	
    	String  check=StatusReportPage.GetRejection_Status();
    	
    	if(check!="rejected")////get the webelement for WebElement Actionbox;
    	{
    		Assert.assertTrue(true);
    		System.out.println("report is Unpublished successfully");
    		
    	}else
    	{
    		Assert.assertTrue(false);
    		System.out.println("No reports are avalible to Unpublish");
    	}
    
    }


}
