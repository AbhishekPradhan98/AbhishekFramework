package StepDefinitions;


import java.util.HashMap;
import java.util.List;

import org.junit.Assert;

import PageObjects.HomePage;
import PageObjects.LogInPage;
import QA.DriverFactory.DriverFactory;
import TestBase.BaseClass;
import UtilityFiles.ExcelDataReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HPRadar_LoginDDT {
	
	ExcelDataReader DataReader=new ExcelDataReader();
	LogInPage LogInPage = new LogInPage(DriverFactory.getDriver());

	HomePage HomePage=new HomePage(DriverFactory.getDriver());
	
	@When("User in on login page")
	public void user_in_on_login_page() {
		
		
	   
	}
	
	@Then("check User navigates to HomePage Page by passing Email and Password with excel row {string}")
	public void check_user_navigates_to_home_page_page_by_passing_email_and_password_with_excel_row(String rows) {
		  List<HashMap<String, String>> datamap = DataReader.data(System.getProperty("user.dir")+"\\TestData\\HPRadar_LoginTest Data.xlsx", "User Login Credentials");

	        int index=Integer.parseInt(rows)-1;
	        String UserName= datamap.get(index).get("UserName");
	        String Password= datamap.get(index).get("Password");
	        String exp_res= datamap.get(index).get("Result");
	        
	        LogInPage.setEmail(UserName, Password);
	  	        
	
    
	        try
	        {
	            boolean targetpage=HomePage.IsHomePageExists();

	           if(exp_res.equals("Valid"))
	            {
	               if(targetpage==true)
	                {
	                	  Assert.assertTrue(true);
	                	  HomePage.ClickOnLogOut();
	                  
	                }
	                else
	                {
	                    Assert.assertTrue(false);
	                }
	            }

	            if(exp_res.equals("Invalid"))
	            {
	                if(targetpage==true)
	                {
	                	HomePage.ClickOnLogOut();
	                    Assert.assertTrue(false);
	                }
	                else
	                {
	                    Assert.assertTrue(true);
	                }
	            }


	        }
	        catch(Exception e)
	        {

	            Assert.assertTrue(false);
	        }
	        BaseClass.driver.close();
	    }
	
}
