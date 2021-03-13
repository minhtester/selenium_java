package modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest {
	@Test
	void validateCheckboxIsChecked() {
		//step 1
		WebDriver driver = new ChromeDriver();
		//step 2
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chk1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement chk2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		//step 3
		check(chk1);
		//step 4
		Assert.assertTrue(chk1.isSelected());
		//step 5
		check(chk2);
		//step 6
		Assert.assertTrue(chk2.isSelected());
	}
	private void check(WebElement e) {
		if(!e.isSelected()) {
			e.click();
		}
	}
	

}
