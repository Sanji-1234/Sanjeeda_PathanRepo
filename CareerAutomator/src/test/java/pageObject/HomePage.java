package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver ldriver;

	public HomePage(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);

	}

	@FindBy(xpath = "//button[@aria-label='Career']")
	WebElement careerTab;

	@FindBy(xpath = "//li[@id='tab-option-1']/div/p[@class='listHeading']")
	WebElement jobClick;

	@FindBy(xpath = "//*[@class='ant-card-body']/div/div/div/div[@class='job-role'])[1]")
	WebElement clickOnUser;

	@FindBy(xpath = "//*[text()='Ask a Question']")
	WebElement askAQuestion;

	@FindBy(xpath = "//button[@aria-label='Inbox']")
	WebElement inboxTab;

	@FindBy(xpath = "//*[@class='rich-text ql-editor']")
	WebElement messageInbox;

	@FindBy(xpath = "//*[text()='View Profile']")
	WebElement viewProfile;

	public void homePageUrl(String homeUrl) {
		ldriver.get(homeUrl);
	}

	public void moveToCareer() {
		Actions act = new Actions(ldriver);
		act.moveToElement(careerTab).click().build().perform();
		jobClick.click();
	}

	public void userSelect() {
		clickOnUser.click();

	}

	public void messageSend(String msg) {
		askAQuestion.sendKeys(msg);
	}

	public void inboxTab() {
		inboxTab.click();
	}

	public void validateMsg(String messageinbox) {
		boolean message = messageInbox.isDisplayed();
		System.out.println(message);
	}

}