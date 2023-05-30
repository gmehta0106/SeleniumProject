package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By loginBtn = By.className("btn btn-primary");
		
	//create webElement + perform action
		doSendkeys(emailId, "gitanjali@gmail.com");
		doSendkeys(pwd, "geet@123");
		doClick(loginBtn);

	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendkeys(By locator, String value) {
		//getElement(locator).clear();
		getElement(locator).sendKeys(value);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
