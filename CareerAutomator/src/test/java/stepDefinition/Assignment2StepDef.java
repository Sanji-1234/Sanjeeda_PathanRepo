package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Assignment2;

public class Assignment2StepDef {
	public WebDriver driver;
	public Assignment2 assign;

	@Given("I am on the Home page using url {string}")
	public void i_am_on_the_home_page_using_url(String url) {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        assign= new Assignment2(driver);
	}

	@When("I navigate to Career Paths")
	public void navigateToCareerPaths() {
		assign.navigateToCareerPath();
	}

	@When("I click on {int} career paths from the {string} section with {string}")
	public void i_click_on_career_paths_from_the_section_with(Integer int1, String string, String string2) {
		assign.clickFirstInspirationCareerPath();
	}

	@And("I store the names of the selected career paths")
	public void storeCareerPathNames() {
		assign.storeNamesInCollection(3);
	}

	@When("i am on home using {string} page option three is pre-selected in the Career Stage section on home page")
	public void i_am_on_home_using_page_option_three_is_pre_selected_in_the_career_stage_section_on_home_page(
			String homeUrl) {
		driver.get(homeUrl);
		assign.careerStage(homeUrl);

	}

	@When("I go back to the homepage and refresh")
	public void i_go_back_to_the_homepage_and_refresh() {
		assign.goBackAndRefresh();
	}

	@Then("I verify that the \"Recently viewed careers\" list is reversed compared to step 2")
	public void verifyRecentlyViewedCareers() {
		assign.isListReversed(null, null);
	}
}
