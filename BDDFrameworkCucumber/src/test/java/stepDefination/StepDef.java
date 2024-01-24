package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObject.LoginPage;

public class StepDef {
	public WebDriver driver;
	public LoginPage loginpg;
	@Given("^user Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() throws Throwable {
	  driver=new ChromeDriver();
	  loginpg = new LoginPage(driver);
	}

	@When("^User open URL \"([^\"]*)\"$")
	
	public void user_open_URL(String URL) throws Throwable {
		String URL1="https://admin-demo.nopcommerce.com/login";
	    driver.get(URL1);
	}

	@And("^user enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_Password_as(String email, String pass) throws Throwable {
		loginpg.enterEmail(email);
		loginpg.enterPassword(pass);
	}

	@And("^Click on Login$")
	public void click_on_Login() throws Throwable {
		loginpg.clicklogin_Btn(null);
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String Ex_title) throws Throwable {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(Ex_title)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	    
	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
		loginpg.clicklogout_Btn(null);
	}

	@Then("^Page Title should be \"Your store\\. Login”$")
	public void page_Title_should_be_Your_store_Login(String Exp_title) throws Throwable {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(Exp_title)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
	  driver.close();
	  driver.quit();
	}




}