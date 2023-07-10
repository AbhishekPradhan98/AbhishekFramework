package QA.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	
	public static WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 */
	
	
	
	public static   WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);
		
		
		
		if (browser.equalsIgnoreCase("chrome")) {
           
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\10141H1R\\Downloads\\chromedriver_win32\\chromedriver.exe");
			tlDriver.set(new ChromeDriver());
		
			
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            
	        	System.setProperty("webdriver.gecko.driver", 
						"C:\\Users\\10141H1R\\HPCL-POC\\HPCL_POC_Demo\\BrowserDrivers\\geckodriver.exe");
	        	tlDriver.set(new FirefoxDriver());
	        	
	           
	        } else if (browser.equalsIgnoreCase("edge")) {
	           
	        	
	        	System.setProperty("webdriver.edge.driver",
					"C:\\Users\\10141H1R\\HPCL-POC\\HPCL_POC_Demo\\BrowserDrivers\\msedgedriver.exe");
	        	tlDriver.set(new EdgeDriver());
	        	
	        } else {
	            System.out.println("Invalid browser specified.");
	        }
		
		

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get("http://10.90.170.140/hpcl_grp1/PRCC/index_beforeCA.jsp");
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
