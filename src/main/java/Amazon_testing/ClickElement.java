package Amazon_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();//don't put WebDriver here to avoid the null exception 
		driver.get("https://app.hubspot.com/login");

		By loginId = By.id("username");
		By password = By.id("password");
		By loginBtn=By.id("password-login-button");

//		WebElement login = driver.findElement(loginId);
//		WebElement pwd = driver.findElement(password);
//		WebElement LoginBtn = driver.findElement(loginBtn);

//		login.sendKeys("git");
//		pwd.sendKeys("abc@123");
//		LoginBtn.click();
		doSendkeys(loginId, "radhawalabhlal");
		doSendkeys(password, "radharamanlal");
		doClick(loginBtn);

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
