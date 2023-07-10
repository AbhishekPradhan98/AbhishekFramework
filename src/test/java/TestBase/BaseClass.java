package TestBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class BaseClass {

	public static WebDriver driver;

	public static ResourceBundle rb; // for reading properties file
	//public static String br; // to store browser name

	// Junit hook - executes once
	
	@Before
	public static void LaunchApplication()  {

		rb = ResourceBundle.getBundle("Config");// Reading config.properties (for browser)
//		//Get the BrowserName from Config.properties file and store in Br Varible
//		
		// br = rb.getString("browser");

//		if (br.equalsIgnoreCase("chrome")) {
//
//			//System.setProperty("webdriver.chrome.driver",
//					//"C:\\Users\\10141H1R\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//
//		} else if (br.equalsIgnoreCase("edge")) {
//			
//
//			System.setProperty("webdriver.edge.driver",
//					"C:\\Users\\10141H1R\\HPCL-POC\\HPCL_POC_Demo\\BrowserDrivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//
//		} else if (br.equalsIgnoreCase("firefox")) {
//
//			System.setProperty("webdriver.gecko.driver", 
//						"C:\\Users\\10141H1R\\HPCL-POC\\HPCL_POC_Demo\\BrowserDrivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		} else {
//			System.out.println("Invalid browser specified.");
//		}
//		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\10141H1R\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(rb.getString("HPCLURL"));

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// Junit hook - executes once

//	@AfterClass
//	public static void Application_Close() {
//		driver.quit();
//	}
//
////	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Scenario status ======>" + scenario.getStatus());
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		driver.quit();
	}

}
