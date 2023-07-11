package TestRunner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import ApplicationHooks.Hooks;
import QA.DriverFactory.*;

import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import TestBase.BaseClass;
import io.cucumber.testng.CucumberOptions;
import TestRunner.FeaturePath;
import UtilityFiles.ConfigReader;

@SuppressWarnings("unused")
@CucumberOptions
	(
			
			//Sfeatures= {FeaturePath.feature},
			features= {FeaturePath.UserHomePage,FeaturePath.AdminHomeapge},
            glue={"StepDefinitions","ApplicationHooks"},
           
          
            		plugin= {"pretty",
                            "html:reports/HPCL_Cucumber-Reports.html",
                            "json:reports/HPCL_Reports.json",
                            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                            "rerun:target/rerun.txt", //Mandatory to capture failures
                          	} 
            
           // dryRun=false,
           // monochrome=true,
         // tags = "@user_Sanity or @smoke"
          //tags = "@Admin_Sanity"
           //tags = "@User_Sanity"
           //tags =  "@unit"
           
		
		)

public class TestNgRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	
	@BeforeClass
	@Parameters({"Browser"})
	public void SetUpApplication(String browser) {
		ConfigReader.SetBroserType(browser);
	
	}
}
