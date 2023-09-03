package pageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	private WebDriver ldriver;
	private List<String> storedCareerPaths = new ArrayList<String>();

	public Assignment2(WebDriver rDriver) {
		ldriver = rDriver;
		PageFactory.initElements(rDriver, this);

	}

	@FindBy(xpath = "//button[@aria-label='Career']")
	WebElement careerTab;

	@FindBy(xpath = "(//*[@class='listHeading'])[1]")
	WebElement careerPathTab;

	@FindBy(xpath = "(//*[@class='Carousel-module_root__u9T4G pg-carousel-wrapper'])[1]//*[@class='career-card__title'])[1]")
	WebElement inspiration;

	@FindBy(xpath = "(//*[text()='Update'])[1]")
	WebElement updatebtn;

	public void homePageUrl(String homeUrl) {
		ldriver.get(homeUrl);
	}

	public void navigateToCareerPath() {
		Actions act = new Actions(ldriver);
		act.moveToElement(careerPathTab);
	}

	public void clickFirstInspirationCareerPath() {
		inspiration.click();
	}

	public List<String> storeNamesInCollection(int numberOfPaths) {
		List<String> careerPathNames = new ArrayList<String>();
		for (int i = 0; i < numberOfPaths; i++) {
			String pathName = ldriver.findElement(By.xpath(
					"(//*[@class='Carousel-module_root__u9T4G pg-carousel-wrapper'])[1]//*[@class='career-card__title']["
							+ (i + 1) + "]"))
					.getText();
			careerPathNames.add(pathName);
		}
		return careerPathNames;

	}

	public void careerStage(String url) {
		updatebtn.click();
		WebElement careerStageOption3 = ldriver.findElement(By.xpath("(//*[text()='Update'])[1]"));
		Select select = new Select(careerStageOption3);
		WebElement selectedOption = select.getFirstSelectedOption();
		String selectedValue = selectedOption.getAttribute("value");
		if (!"3".equals(selectedValue)) {
			// If option 3 is not selected, select it
			select.selectByValue("3");
		}
	}

	public void goBackAndRefresh() {
		ldriver.navigate().back();
		ldriver.navigate().refresh();
	}

	public void isListReversed(List<String> originalList, List<String> reversedList) {
		List<String> recentlyViewedCareers = new ArrayList<String>();
		WebElement recentlyViewedCareersSection = ldriver.findElement(By.xpath("//div[@id='recently-viewed-careers']"));
		List<WebElement> careers = recentlyViewedCareersSection
				.findElements(By.xpath(".//div[@class='career-card__title']"));

		for (WebElement career : careers) {
			recentlyViewedCareers.add(career.getText());
		}
		List<String> reversedList2 = new ArrayList<String>(storedCareerPaths);
		Collections.reverse(reversedList2);

		// Compare the reversed list with recently viewed careers
		assert recentlyViewedCareers.equals(reversedList);
	}

}
