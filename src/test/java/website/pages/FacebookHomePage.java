package website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookHomePage {
	private WebDriver driver;
    private By byUserNavigation = By.id("userNavigationLabel");
	public FacebookHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public boolean isDisplayed() {
        if (Utils.waitForElementDisplay(driver, byUserNavigation, 10)) {
            return true;
        } else {
            return false;
        }
    }
}
