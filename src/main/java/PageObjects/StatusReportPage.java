package PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;

public class StatusReportPage extends BasePage {
	
	ActionClass act = new ActionClass();

	public StatusReportPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//table[@id='photo_list']//tbody//tr[1]//td[3]//i)[1]")
	WebElement Select;
	
	@FindBy(xpath = "(//table[@id='photo_list']//tbody//tr[1]//td[3]//button)[2]")
	WebElement Reject;
	
	@FindBy(xpath = "//table[@id='photo_list']//tbody//tr[1]//td[3]//span//button")
	WebElement Unpublish;

	@FindBy(xpath = "//table[@id='photo_list']//tbody//tr[1]//td[3]//span//form//textarea")
	WebElement SearchBox;

	
	@FindBy(xpath = "(//table[@id='photo_list']//tbody//tr[1]//td[3]//span/span//button)[1]")
	WebElement Submit;

	@FindBy(xpath = "//b[normalize-space()='Logout']")
	WebElement LogOut;
	
//	@FindBy(xpath = "//table[@id='photo_list']//tbody//tr[2]//td[7]//span")
//	List<WebElement> Stutas;
	
	@FindBy(xpath = "(//table[@id='photo_list']//td[7]//span[@class=\"rejected\"])[1]")
	WebElement Stutas;
	
	@FindBy(xpath = "//table[@id='photo_list']//tbody//tr[1]//td[5]")
	WebElement UploadBy;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement SearchBox1;
	
	@FindBy(xpath = "(//table[@id='photo_list']//td[2])[1]")
	WebElement Category;
	
	
	public void EnterSearchBox(String Name)
	{
		SearchBox1.sendKeys(Name);
		
	}
	
	public String GetCategory()
	{
		String category=act.GetText(driver, Category);
		return category;
	}
	
	
//	public String GetUploadBy()
//	{
//		String Name=act.GetText(driver, UploadBy);
//		System.out.println("HP post is upload by:"+Name);
//		return Name;
//	}
	public boolean SelectButtonExist1()
	{
		//boolean rightbtn=act.Isdisplayed(driver, Select);
				boolean flag=true;
		if(act.Isdisplayed(driver, Select))
		{
			Assert.assertTrue(false);
			System.out.println("Post are not available inform to user upload the post");
			flag=false;
		}else
		{
			Assert.assertTrue(true);
			System.out.println("Post is available and wating for the admin approve");
			
		}
		return flag;
		
		
		
	}
	public void get_status ()
	{
//		for(WebElement data:Stutas)
//		{
//			String Status=data.getText();
//			System.out.println(Status);
//		
//		}
//			
//		
	}
	
	public String Unpublish(String unpulish)
	{
		//act.Isdisplayed(driver, Unpublish);
		act.JavascriptExe(driver, Unpublish);
		WebElement ele=driver.findElement(By.xpath("//table[@id='photo_list']//tbody//tr[1]//td[3]//span//span//form//textarea"));
		ele.sendKeys(unpulish);
		driver.findElement(By.xpath("//table[@id='photo_list']//tbody//tr[1]//td[3]//span//span//form//button")).click();
		Alert alert=driver.switchTo().alert();
		String AlertMsg=alert.getText();
		System.out.println(AlertMsg);
		alert.accept();
		return AlertMsg;	
		
	}
	
	public String ApprovedPost(String approved)
	{
		act.JavascriptExe(driver, Select);
		act.TextSend(SearchBox, approved);
		act.JavascriptExe(driver, Submit);
		//act.SwitchToAlert(driver, Select);
		
		Alert alert=driver.switchTo().alert();
		String AlertMsg=alert.getText();
		System.out.println(AlertMsg);
		alert.accept();
		return AlertMsg;	
		
	}
	
	public String RejectPost(String rejected)
	{
		act.JavascriptExe(driver, Reject);
		WebElement ele=driver.findElement(By.xpath("(//table[@id='photo_list']//tbody//tr[1]//td[3]//span//form//textarea)[2]"));
		ele.sendKeys(rejected);
		driver.findElement(By.xpath("(//table[@id='photo_list']//tbody//tr[1]//td[3]//span//form//button)[2]")).click();
		
		//act.JavascriptExe(driver, Submit);
		//act.SwitchToAlert(driver, Select);
		
		Alert alert=driver.switchTo().alert();
		String AlertMsg=alert.getText();
		System.out.println(AlertMsg);
		alert.accept();
		return AlertMsg;	
		
	}
	
	public String GetRejection_Status()
	
	{
		
	
	//WebElement data=Stutas.get(2);
	String Status=Stutas.getText();
	return Status;
	}

}
