package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_5WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// Rule - Create a webelement + perform action (click, senkeys, gettext,
		// isdisplayed..)
		// How to create - with findElement() + click(), sendkeys();
		// By is a in-build class in selenium and id is a static method inside the By
		// class hence we are calling with "By" class name
		// Created WebElement = "driver.findElement(By.id("input-firstname"))"

		// 1st approach - hitting the server n numbers of time to find the element
		driver.findElement(By.id("input-firstname")).sendKeys("git");
		//System.out.println(driver.getClass());//OutPut: class org.openqa.selenium.chrome.ChromeDriver
		//driver.quit();

		// 2nd approach - re-usability 
		// findElement is returning WebElement and WebElement is exsiting interface in
		// selenium only
		// WebElement emailID = driver.findElement(By.id("input-firstname"));
		// emailID.sendKeys("Gitanjali");

		// 3rd approach - create the by locator
		// as BY locator is not hitting the server and you can use these By locator
		// whenever u want to use these webElements
		// By email = By.id("input-firstname");
		// WebElement emailID = driver.findElement(email);
		// emailID.sendKeys("Gitanjali");

		// 4th approach- Maintain the By locator and create a generic function to create
		// a web element
		// only created driver.findElement once
//		By FirstName = By.id("input-firstname");
//		By LastName = By.id("input-lastname");
//		WebElement Fname= getElement(FirstName);//to call getElement need to maintain By locator and By locator is not hitting the server 
//		WebElement LName=getElement(LastName);
//		emailID.sendKeys("Gitanjali");
//		LName.sendKeys("Mehta");

		// 5th approach - By locator and create generic function for webElement and action 
		// and write driver.findElement only once 
		//but these methods doSendKeys andgetElement only applicable for this class 
//		By FirstName = By.id("input-firstname");
//		By LastName = By.id("input-lastname");
//		doSendKeys(FirstName, "Gitanjali");
//		doSendKeys(LastName, "Mehta");
		
		//6th approach By locator and create generic function for webElement and action in util class 
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		Se_5ElementUtil eleUtil = new Se_5ElementUtil(driver);
		eleUtil.doSendKeys(FirstName, "Gitanjali");
		eleUtil.doSendKeys(LastName, "Mehta");
		
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
