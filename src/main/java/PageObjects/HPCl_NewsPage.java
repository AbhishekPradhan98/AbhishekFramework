/**
 * 
 */
package PageObjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

/**
 * @author kpkmt942
 *
 */
public class HPCl_NewsPage extends BasePage {

	ActionClass act = new ActionClass();

	public HPCl_NewsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//h3[1]")
	WebElement HPNews;

	@FindBy(xpath = "//select[@id='category']")
	WebElement Category;

	@FindBy(xpath = "//input[@id='Photo']")
	WebElement ChooseFile;

	@FindBy(xpath = "//input[@name='Submit']")
	WebElement Upload;

//	@FindBy(xpath = "//input[@name='Submit']")
//	WebElement Upload;

	public boolean HPNewsPageExist() {
		return act.Isdisplayed(driver, HPNews);

	}

	public void SelectCategory(String category) {
		act.SelectByValue(Category, category);// User select the Category - Photograph

	}

	public void SelectChooseFile() throws Throwable {

		act.Click(driver, ChooseFile);
		ChooseFile.sendKeys("C:\\Users\\10141H1R\\Desktop\\Scenery Image1.png");
		Robot robot = new Robot();
		robot.delay(2000);
		// waitForElement();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.delay(2000);
		// waitForElement();
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		// waitForElement();

		act.Click(driver, Upload);
//		

	}

	
	public String GetAlert_Message()
	{
		String AlertMsg=null;
		try {
//			
			Alert window=driver.switchTo().alert();
			
			 
			AlertMsg=window.getText();
			 
			window.accept();
		}catch(NoAlertPresentException e)
		{
			//System.out.println("Please check the alert message if alert is present");
			
		}
		return AlertMsg;
		
	
		
		}

}
