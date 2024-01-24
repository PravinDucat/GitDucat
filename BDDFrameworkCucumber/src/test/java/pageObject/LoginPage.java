package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver Idriver;
public LoginPage(WebDriver rdriver) {
	Idriver = rdriver;
	PageFactory.initElements(rdriver, this);
}
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//*[@class='button-1 login-button']")
	WebElement Login_btn;
	
	@FindBy(linkText="Logout")
	WebElement Logout_btn;
	
	public void enterEmail(String emailAdd) {
		Email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pswd) {
		Password.sendKeys(pswd);
	}
	
	public void clicklogin_Btn(String click) {
		Login_btn.click();
	}
	public void clicklogout_Btn(String click) {
		Logout_btn.click();
	}
	
}
