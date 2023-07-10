package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

public class HPNews_SubmissionPage extends BasePage {
	
	ActionClass act = new ActionClass();

	public HPNews_SubmissionPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//h2[normalize-space()='HP News Submissions']")
	WebElement HPNews;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement SearchBox;
	
	@FindBy(xpath = "(//table[@id='hpnews']//td[2])[1]")
	WebElement Category;
	
	@FindBy(xpath = "//table[@id='hpnews']//tbody//tr[1]//td[3]")
	WebElement UploadBy;
	
	@FindBy(xpath = "//table[@id='hpnews']//tbody//tr[1]")
	WebElement GetDetails;
	

	
	public boolean HPNewsPageExist()
	{
		return act.Isdisplayed(driver, HPNews);
		
	}
	
	public void EnterSearchBox(String Name)
	{
		act.TextSend(SearchBox, Name);
	}
	
	public String GetCategory()
	{
		String categor =Category.getText();
		
		//y=act.GetText(driver, Category);
		return categor;
	}
	
	public String GetUpladName()
	{
		String name=act.GetText(driver, UploadBy);
		return name;
	}
	
	public String Get_HPnewsDetails()
	{
		return act.GetText(driver, GetDetails);
		
	}
}