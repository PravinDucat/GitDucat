package stepDefination;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




import io.cucumber.java.en.*;

public class DemoSDF {
	
	WebDriver driver;

	@Given("User is already on login page")
	public void user_is_already_on_login_page() {
		driver= (WebDriver) new ChromeDriver();
		driver.get("https://www.rediffmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='signin']")).click();
	    
	}

	@When("title of login page is rediff")
	public void title_of_login_page_is_rediff(){
	String exTitle= "Rediffmail";
	   String title= driver.getTitle();
	   System.out.println(title);
	   AssertJUnit.assertEquals(exTitle,title );
	   
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password()  {
	   driver.findElement(By.id("login1")).sendKeys("testingmantra2000@rediffmail.com");
	   driver.findElement(By.id("password")).sendKeys("20000101@test");
	   
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.name("proceed")).click();
	}

	@Then("user is on home page")
	public void user_is_on_home_page()  {
		String exTitle= "Rediffmail";
		   String title= driver.getTitle();
		   System.out.println(title);
		   AssertJUnit.assertEquals(exTitle,title );
		   
	}

}
