package website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {
	public static boolean waitForElementDisplay(WebDriver driver,By by,int waitInSecond) {
		for(int i = 0;i<waitInSecond/2+1;i++) {
			try {
				if(driver.findElement(by).isDisplayed()) {
					return true;
				}
				Thread.sleep(2*1000);
			}
			catch(Exception e) {
				System.out.println("waiting element for display...");
			}
		}
		return false;
	}
}
