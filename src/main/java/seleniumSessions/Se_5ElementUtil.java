package seleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Se_5ElementUtil {

	private WebDriver driver;
	private final int DEFAULT_TIME_OUT = 5;

	// create constructor here
	public Se_5ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			System.out.println("Null Values are not allowed");
			throw new MySeleniumException("ValueCannotBeNULL");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public void doClick(By locator, int timeout) {
	checkElementIsClickable(locator, timeout).click();
	}

	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public void doClear(By locator) {
		getElement(locator).clear();
	}

	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}

	/**
	 * one more method to get element but with wait means method overloading
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement getElement(By locator, int timeout) {
		return waitForElementVisible(locator, timeout);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("Element is found " + locator);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found " + locator);
//			try {
//				Thread.sleep(5000);//Static waits
//			} catch (InterruptedException e1) {
//			
//				e1.printStackTrace();
//			}
			element = waitForElementVisible(locator, DEFAULT_TIME_OUT);

		}
		return element;

	}
	
	//******Actions class Utils**************
	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	public void doActionsClick(By locator, int timeout) {
		Actions act= new Actions(driver);
		act.click(checkElementIsClickable(locator, timeout)).build().perform();
	}

	// ******************************Wait Util******************
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement Se_26waitForSpecificElementPresence(By locator, int timeOut) {
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
	public WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locator are visible. Visibility means that the elements are not
	 * only displayed but also have a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		// System.out.println(eleList.size());
	}
	/**
	 * An expectation for checking that there is at least one element present on a web page.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		// System.out.println(eleList.size());
	}
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 */
	public void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}//if this click method will not click the element then use actions class and if not then we use java script executor 
	
	
	/**
	 * An expectation for checking an element is visible and enabled such that you can click it.
	 * @param locator
	 * @param timeOut
	 */
	// Create this method - that element is clickable or not 
	//and call this method inside doclick method but dont want to disturb this utility so overload this method by passing more params 
	public WebElement checkElementIsClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.elementToBeClickable(locator));//not clicking here so immediate return
		}
	}

