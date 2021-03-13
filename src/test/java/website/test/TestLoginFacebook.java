package website.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import website.pages.FacebookHomePage;
import website.pages.LoginFacebookPage;

public class TestLoginFacebook {
	 public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", 
	                "D:\\javacore\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        // Open website
	        driver.get("https://facebook.com");
	        // Maximize the browser
	        driver.manage().window().maximize();
	        // Login facebook
	        LoginFacebookPage facebookLogin = new LoginFacebookPage(driver);
	        FacebookHomePage homePage = facebookLogin.login("0937282873", 
	                "Hana233299.");
	        if (homePage.isDisplayed()) {
	            System.out.println("Login Successfully!");
	        } else {
	            System.out.println("Login Fail!");
	        }
	        // Quit driver
	        driver.quit();
	    }
}
