package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;

public class HomeStepDef {
	public WebDriver driver;
	public HomePage homepg;

	@Given("I am on the Home page with url {string}")
	public void i_am_on_the_home_page_with_url(String homeUrl) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		homepg = new HomePage(driver);

	}

	@When("I navigate to Career > Jobs")
	public void i_navigate_to_career_jobs() {
		homepg.moveToCareer();
	}

	@When("I click on any job")
	public void i_click_on_any_job() {
		homepg.userSelect();

	}

	@When("I message any recommended user as {string}")
	public void i_message_any_recommended_user_as(String msg) {
		homepg.messageSend(msg);
	}

	@When("I navigate to the inbox")
	public void i_navigate_to_the_inbox() {
		homepg.inboxTab();
	}

	@Then("I should see the sent message in my inbox as {string}")
	public void i_should_see_the_sent_message_in_my_inbox_as(String sentmsg) {
		homepg.validateMsg(sentmsg);
	}

}
