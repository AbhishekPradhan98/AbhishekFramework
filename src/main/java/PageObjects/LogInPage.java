package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;

import WebActions.ActionClass;



/**
 * @author kpkmt942
 * LoginPage User abel to enter the LoginPage
 *
 */


public class LogInPage extends BasePage {

	ActionClass act = new ActionClass();

	public LogInPage(WebDriver driver) {
		super(driver);

	}
	
	//Locators for or WebElements for Action 

	@FindBy(xpath = "//input[@placeholder='Employee Number']")
	WebElement User_Name;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement PassWord_Nme;

	@FindBy(xpath = "//button[@class='login100-form-btn']")
	WebElement LogIn_Btn;

	
	//Action Methods to Perform on WebElements
	public HomePage setEmail(String email, String Psw) {
		
		
		User_Name.sendKeys(email);
		PassWord_Nme.sendKeys(Psw);
		LogIn_Btn.click();
		
		return new HomePage(driver);

		
		
	}
	

}
