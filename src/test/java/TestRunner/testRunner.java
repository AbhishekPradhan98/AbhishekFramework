package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                //features= {".//Features/"},
//                features= {".//src\\test\\java\\HP_Radar_featureFiles\\feature\\HPRadarLoginDDT.feature"},
               // features= {".//src\\test\\java\\HP_Radar_featureFiles\\feature\\HP_Radar_LoginPage.feature,UserHomePage.feature"},
                features= {".//src/test/java/HomePage.feature"},
                glue={"StepDefinitions","TestBase"},
               
              
                		plugin= {"pretty",
                                "html:reports/HPCL_Cucumber-Reports.html",
                                "json:reports/HPCL_Reports.json",
                                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                                "rerun:target/rerun.txt", //Mandatory to capture failures
                              	},    
                
               // dryRun=false,
               // monochrome=true,
               tags = "@Smoke"//Scenarios tagged with 
                
        )

public class testRunner {
	
	
}
