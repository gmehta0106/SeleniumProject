package Amazon_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementUtil {

	private WebDriver driver;

	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	public void doSendkeys(By locator, String value) {
		getElement(locator).clear();
		getElement(locator).sendKeys(value);
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
