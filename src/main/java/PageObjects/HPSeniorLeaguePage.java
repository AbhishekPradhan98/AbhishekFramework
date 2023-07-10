package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

public class HPSeniorLeaguePage extends BasePage{
	
	ActionClass act = new ActionClass();


	public HPSeniorLeaguePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath = "//select[@id='month']")
	WebElement Month;
	
		@FindBy(xpath = "//div[@class=\"row \"]")
			WebElement Page;
		
	
	@FindBy(xpath = "//select[@id='year']")
	WebElement Year;
	
	@FindBy(xpath = "//input[@id='E_name']")
	WebElement EmpName;
	
	@FindBy(xpath = "//input[@id='Designation']")
	WebElement Designation;
	
	@FindBy(xpath = "//input[@id='Location']")
	WebElement Loacation;
	
	@FindBy(xpath = "//input[@id='priority']")
	WebElement Priority	;
	
	@FindBy(xpath = "//input[@id='Videofile']")
	WebElement File	;
	
	@FindBy(xpath = "//input[@id='Upload_Video']")
	WebElement Upload;
	
	public void  HPSeniorLeaguePageExist()
	{
		
		
		act.Isdisplayed(driver, Page);
	}
	
	public void SetMontAndYear(String month, String year)
	{
		
		act.SelectByValue(Month, month);
		act.SelectByValue(Year, year);
		
		
	}
	
	public void SetEmpNameAnd_Designation(String empName, String designation)
	{

		EmpName.sendKeys(empName);
		Designation.sendKeys(designation);
		
		
	}
	
	public void SetLocAnd_Priority(String loacation, String priority)
	{
		Loacation.sendKeys(loacation);
		Priority.sendKeys(priority);
	}
	
	public void UploadFile() throws AWTException
	{
		
		//act.Click(driver, File);
		//File.click();
		
		
		File.sendKeys("C:\\Users\\10141H1R\\Desktop\\NMR.mp4");
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ESCAPE);
		
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		
		
	}
	
	public void ClickOn_UploadBtn()
	{
		
		Upload.click();
	}
	
	public String VerifyAlertMsg()
	{
		
//		String AlertMsg=null;
//		try {
//			
//			Alert window=driver.switchTo().alert();
//			
//			 
//			 AlertMsg=window.getText();
//			 
//			
//		}catch(UnhandledAlertException e)
//		{
//			System.out.println("Please check the alert message if alert is present");
//			
//		}
//		return AlertMsg;
//		
//	
//		
//		}
	
		
		
		
		
		
		
		Alert alert=driver.switchTo().alert();
		String AlertMsg=alert.getText();
		//System.out.println(AlertMsg);
		alert.accept();
		
		return AlertMsg;
	}

}