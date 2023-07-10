package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

public class HPCL_PostPage extends BasePage {

	ActionClass act = new ActionClass();
	int max_phots = 8;

	public HPCL_PostPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//select[@id='category']")
	WebElement Category;

	@FindBy(xpath = "//input[@id='Photo_title']")
	WebElement Title;

	@FindBy(xpath = "//i[@class='fa fa-plus w3-button w3-red']")
	WebElement AddPhots;


	@FindBy(xpath = "(//input[@id='Photo_caption1'])[1]")
	WebElement PhotoCaption;

	@FindBy(xpath = "//span[@id='button_eng']")
	WebElement English;

	@FindBy(xpath = "//span[@id='button_hin']")
	WebElement Hindi;


	@FindBy(xpath = "(//body[@contenteditable=\"true\"])[1]")
	WebElement SearchBocx;

	@FindBy(xpath = "(//table[@id='tblAddRow']//input)[3]")
	WebElement TagPeople;

	@FindBy(xpath = "//input[@id='checkedAll']")
	WebElement CheckBox;

	@FindBy(xpath = "//div[@id='1']//input[@name='Submit']")
	WebElement Upload;

	@FindBy(xpath = "//iframe[@title='Rich Text Editor, Description']")
	WebElement Frame;

	public void SelectCategory(String category, String Titlec_OfPhoto) {
		act.SelectByValue(Category, category);// User select the Category - Activities
		act.TextSend(Title, Titlec_OfPhoto);// Title of the Photo - Green Scenery

	}

	public void Addphoto() {
		for (int i = 1; i <= max_phots; i++) {
			act.Click(driver, AddPhots);

		}
	}

	public void Choose_Photos() throws AWTException {
		int ele1 = driver.findElements(By.xpath("//table[@id='photoTable']//tr//td[2]//input[@type=\"file\"]")).size();

		for (int r = 2; r <= ele1 + 1; r++) {
			
			

			WebElement ele = driver
					.findElement(By.xpath("//table[@id='photoTable']//tr[" + r + "]//td[2]//input[@type='file']"));

			ele.sendKeys("C:\\Users\\10141H1R\\Desktop\\Scenery Image1.png");
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_ESCAPE);

			robot.keyRelease(KeyEvent.VK_ESCAPE);

			

		}

	}
	
	
	public void Enterphoto_Caption(String Name)
	{
		for (int j = 1; j <= max_phots; j++)

		{
			WebElement ele2 = driver.findElement(By.xpath("(//*[@name=\"Photo_caption\"])["+ j+ "]"));

			ele2.sendKeys(Name);
		}
		
	}

	public void EnterMultiple_Languages(String EngText, String HindiText)// Select English language

	{
		try {
			English.click();
			driver.switchTo().frame(Frame);
			Thread.sleep(2000);
			act.TextSend(SearchBocx, EngText);
			Thread.sleep(2000);
			SearchBocx.clear();
			Thread.sleep(3000);

			// Select Hindi language

			// act.Click(driver, Hindi);
			act.TextSend(SearchBocx, HindiText);// खोज बॉक्स में शुद्ध पाठ दर्ज करें
			driver.switchTo().defaultContent();

		} catch (InterruptedException e) {
			
			e.printStackTrace();

		}
		

	}
	
	public void SlectTag_Pepole(String Tname)// Employee Name (Employee No) - NEHA SACHAN (31929120)

	{

		act.TextSend(TagPeople, Tname);
	}

	public void SlectTag_CheckBox()// Employee Name (Employee No) - NEHA SACHAN (31929120)

	{
		act.Click(driver, CheckBox);

	}

	public HomePage Slect_UploadBtn()// Upload the Post

	{
		act.Click(driver, Upload);
		return new HomePage(driver);

	}
	
	public String GetAlert_Message()
	{
		String AlertMsg=null;
		try {
			
			Alert window=driver.switchTo().alert();
			
			 
			 AlertMsg=window.getText();
			 
			
		}catch(NoAlertPresentException e)
		{
			System.out.println("Please check the alert message if alert is present");
			
		}
		return AlertMsg;
		
	
		
		}
	


}
