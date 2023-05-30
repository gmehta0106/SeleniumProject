package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Se_26WaitForElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By username = By.name("username");
		By password = By.name("password");

		By forgotPWd = By.linkText("Forgot Password?");


//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("test@gmail.com");

		// Se_5ElementUtil eleUtil = new Se_5ElementUtil(driver);

//		waitForSpecificElementPresence(username, 10).sendKeys("naveen@gmail.com");
//		waitForSpecificElementPresence(forgotPWd, 10).click();
		//waitForElementVisible(username, 10).sendKeys("naveen@gamil.com");
//		waitForElementVisible(forgotPWd, 10).click();
		By footers = By.xpath("//footer//ul/li/a");
		//waitForElementsVisible(footers, 10);
		
		Se_5ElementUtil eleUtil = new Se_5ElementUtil(driver);		
		eleUtil.getElement(forgotPWd, 15).click();
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForSpecificElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		//System.out.println(eleList.size());
	}
}
