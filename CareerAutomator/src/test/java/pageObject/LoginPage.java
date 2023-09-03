package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	private WebDriver ldriver;

	public LoginPage(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);

	}

	@FindBy(xpath = "//*[@id='email']")
	WebElement emailInput;

	@FindBy(xpath = "//*[@id='password']")
	WebElement passwordInput;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginBtn;

	public void enterEmail(String email) {
		emailInput.sendKeys(email);

	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void loginClick() {
		loginBtn.click();
	}

	public void verifyPageTitle(String ExpectedTitle) {
		String ActualTitle = ldriver.getTitle();
		if (ActualTitle.equals(ExpectedTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}