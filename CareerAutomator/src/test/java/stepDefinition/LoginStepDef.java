package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class LoginStepDef {
	public WebDriver driver;
	public LoginPage loginpg;

	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg = new LoginPage(driver);
	}

	@When("I open url {string}")
	public void i_open_url(String url) {
		driver.get(url);

	}

	@When("I enter email as {string} and password as {string}")
	public void i_enter_email_as_and_password_as(String emailId, String password) {
		loginpg.enterEmail(emailId);
		loginpg.enterPassword(password);
	}

	@When("I click on login button")
	public void I_click_on_login_button() {
		loginpg.loginClick();
	}

	@Then("I land on the home page and page title should be {string}")
	public void i_land_on_the_home_page_and_page_title_should_be(String expectedTitle) {
		loginpg.verifyPageTitle(expectedTitle);
	}
}
