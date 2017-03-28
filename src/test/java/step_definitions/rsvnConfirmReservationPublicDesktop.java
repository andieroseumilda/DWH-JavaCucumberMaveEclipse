package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Browsers;

public class rsvnConfirmReservationPublicDesktop {
	Browsers browser;
	private WebDriver driver = null; 
	 
	@Before
	public void openBrowser(){
	this.browser = new Browsers();
//	this.driver = this.browser.open();
	}
	
	@After
	public void closeBrowser(){
		this.driver.close();
		this.driver.quit();
	}
	
	@Given("^I am on the IBE$")
	public void i_am_on_the_IBE() throws Throwable {
		this.driver = this.browser.open();
	}
	@When("^I select my desired stay dates$")
	public void i_select_my_desired_stay_dates() throws Throwable {
		System.out.println("sample");
	}

	@Then("^I redirected to the next step$")
	public void i_redirected_to_the_next_step() throws Throwable {
		System.out.println("sample");
	}

}
