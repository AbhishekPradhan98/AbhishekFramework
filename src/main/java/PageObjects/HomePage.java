package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//import TestBase.BaseClass;
import WebActions.ActionClass;

public class HomePage extends BasePage {

	ActionClass act = new ActionClass();

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Elements
	@FindBy(xpath = "//button[@class='button w3-text-white w3-large']")
	WebElement DisplayMsg;//Verify the HomePage target page

	@FindBy(xpath = "//b[normalize-space()='Logout']")
	WebElement LogOut;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/button[1]/b[1]")
	WebElement UploadLink;

	@FindBy(xpath = "(//div[@class=\"dropdown-content\"])[4]//a")
	List<WebElement> UploadLink2;

	@FindBy(xpath = "//a[normalize-space()='Posts']")
	WebElement HPCL_Post;

	@FindBy(xpath = "//a[normalize-space()='HP News']")
	WebElement HPCL_News;
	
	

	public Boolean IsHomePageExists() 
	{
		return  DisplayMsg.isDisplayed();
		
		
		
		

	}

	public void ClickOnLogOut() {
		LogOut.click();
	}

	public void ClickOnUploadLink() {
		act.Click(driver, UploadLink);
	}

	public HPCL_PostPage SelectHPCL_Post() {
		Actions action = new Actions(driver);
		action.moveToElement(UploadLink).build().perform();
		//act.SelectByIndex(HPCL_Post, Index1);
		act.JavascriptExe(driver, HPCL_Post);
		
		return new HPCL_PostPage(driver);
	}

//	public void SelectHPCL_Post(int Index1) {
//
//		for (WebElement link : UploadLink2) {
//			if (link.equals(UploadLink2)) {
//				UploadLink.click();
//			} else {
//				act.SelectByIndex(HPCL_News, Index1);
//				HPCL_News.click();
//		}
//
//	}

	public HPCl_NewsPage SelecHPCL_News() {
		Actions action = new Actions(driver);
		action.moveToElement(UploadLink).build().perform();
		//act.SelectByIndex(HPCL_News, index1);
		act.JavascriptExe(driver, HPCL_News);
		return new HPCl_NewsPage(driver);
	}
	
	

}
