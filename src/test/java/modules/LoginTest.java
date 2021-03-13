package modules;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public static void validCredentials(){
//		System.setProperty("webdriver.driver.chrome",".\\website\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		
		//step 4
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		//step 5
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		//step 6
		String currentUrl = driver.getCurrentUrl();
		//Assert.assertEquals(currentUrl, "https://the-internet.herokuapp.com/secure");
		Assert.assertTrue(currentUrl.contains("secure"));
	}
	@Test
	public static void invalidCredentials(){
//		System.setProperty("webdriver.driver.chrome",".\\website\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		
		//step 4
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword@");
		
		//step 5
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
		//step 6
		String currentUrl = driver.getCurrentUrl();
		//Assert.assertEquals(currentUrl, "https://the-internet.herokuapp.com/secure");
		Assert.assertFalse(currentUrl.contains("secure"));
	}

}
