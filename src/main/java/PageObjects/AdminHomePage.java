package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

public class AdminHomePage extends BasePage {

	ActionClass act = new ActionClass();

	public AdminHomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='dropdown nav-link w3-text-white']//a//b[1]")
	WebElement Admin;
	
	

	@FindBy(xpath = "//a[normalize-space()='Status Report']")
	WebElement StatusReport;

	@FindBy(xpath = "//h2[normalize-space()='Status Report']")
	WebElement StatusReportPage;
	
	@FindBy(xpath = "//a[normalize-space()='HP News Submissions']")
	WebElement HpNews;
	
	@FindBy(xpath = "//a[normalize-space()='HP Senior League Videos']")
	WebElement HPSeniorLeague;
	
	public boolean IsAdminHomepageExist()
	{
		return Admin.isDisplayed();
	}

	public StatusReportPage SelectStatus_report() {
		Actions action = new Actions(driver);
		action.moveToElement(Admin).build().perform();
		act.JavascriptExe(driver, StatusReport);
		return new StatusReportPage(driver);
	}
	
	public HPNews_SubmissionPage SelectHP_News_Submission() {
		Actions action = new Actions(driver);
		action.moveToElement(Admin).build().perform();
		act.JavascriptExe(driver, HpNews);
		return new HPNews_SubmissionPage(driver);
	}
	
	
	public HPNews_SubmissionPage HPSeniorLeaguePage() {
		Actions action = new Actions(driver);
		action.moveToElement(Admin).build().perform();
		act.JavascriptExe(driver, HPSeniorLeague);
		return new HPNews_SubmissionPage(driver);
	}

	public boolean StatusReportPageExist() {

		return act.Isdisplayed(driver, StatusReportPage);

	}
	
	
}
