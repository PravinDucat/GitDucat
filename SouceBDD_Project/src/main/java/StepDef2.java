package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class StepDef2 {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
	  
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		 driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to Hpme Page")
	public void user_is_navigated_to_hpme_page() {
		String ex_title="Swag Labs";
		String title= driver.getTitle();
		
	   Assert.assertEquals(title, ex_title);
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}



}
