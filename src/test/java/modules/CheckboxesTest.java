package modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxesTest {
	@Test
	void validateCheckboxIsChecked() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		List<WebElement> list= driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement chk:list) {
			chk.click();
			System.out.println(chk.isSelected());
		}
	}
}
