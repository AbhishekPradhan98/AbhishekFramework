package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import TestBase.BaseClass;
import WebActions.ActionClass;

public class AdminLoginPage extends BasePage {

	ActionClass act = new ActionClass();

	public AdminLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@placeholder='Employee Number']")
	WebElement User_Name;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement PassWord_Nme;

	@FindBy(xpath = "//button[@class='login100-form-btn']")
	WebElement LogIn_Btn;

	@FindBy(xpath = "//b[normalize-space()='Logout']")
	WebElement Logout;

	public AdminHomePage AdminLogin(String email, String Psw) {

		User_Name.sendKeys(email);
		PassWord_Nme.sendKeys(Psw);
		LogIn_Btn.click();
		return new AdminHomePage(driver);

	}

	public void ClickOn_LoginBtn() {
		Logout.click();
	}
//
//	public void Dologinsetup(String email, String password) {
//		AdminLoginPage AdminLoginPage = new AdminLoginPage(BaseClass.driver);
//		AdminLoginPage.AdminLogin(email, password);
//
//	}

}