package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory
	@FindBy(name= "email")
	WebElement uname;
	
	@FindBy(name= "password")
	WebElement pwd;
	
	@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(linkText= "Forgot your password?")
	WebElement forgotLink;
	
	public LoginPage() {
			PageFactory.initElements(driver, this);
		
	}


public void login(String strUser, String strPwd) {
	uname.sendKeys(strUser);
	pwd.sendKeys(strPwd);
	loginBtn.click();
}
public void forgotPwd() {
	forgotLink.click();
	
}}