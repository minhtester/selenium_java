package website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFacebookPage {
	private WebDriver driver;
	private By byEmail = By.id("email");
	private By byPass = By.id("pass");
	private By byBtnLogin = By.name("login");
	public LoginFacebookPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public FacebookHomePage login(String email,String password) {
		//enter email
		driver.findElement(byEmail).sendKeys(email);
		//enter password
		driver.findElement(byPass).sendKeys(password);
		//click login button
		driver.findElement(byBtnLogin).click();
		
		return new FacebookHomePage(driver);
		
	}
}
