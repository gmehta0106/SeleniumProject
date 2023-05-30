package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_7LocatorConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// attribute coming into key and value format
		// 1. Id: unique attribute
		// 2. Name: can be duplicate
//		driver.findElement(By.name("firstname")).sendKeys("Gitanjali");
//		driver.findElement(By.name("lastname")).sendKeys("Mehta");
//		driver.findElement(By.name("agree")).click();

		// by locator
		By FName = By.name("firstname");
		By Lname = By.name("lastname");
		By Check = By.name("agree");

		Se_5ElementUtil eleUtil = new Se_5ElementUtil(driver);
		eleUtil.doSendKeys(FName, "Gitanjali");
		eleUtil.doSendKeys(Lname, "Mehta");
		eleUtil.doClick(Check);
		// 3.Class Name: not unique attribute
		// 4. Xpath: is not an attribute. its the address of the particular element in
		// HTML DOM.
		// can be unique and can be duplicate
		// input[@name='firstname']

		// 5. CSS(cascaded still sheet) selector: Its not an attribute. It is use for UI
		// design.
		// #input-firstname

		// Xpath vs Css??
		// Xpath use for = pagination, checkBoxes, all the web tables handling with the
		// xpath

		// 6. LinkText: only for links:starts with "<a" tag with properties like - href
		// and class
		// Can be blank - it is possible that link does not have text.
		// can be duplicate
		//driver.findElement(By.linkText("Login")).click();
	
		

		// 7.PartialLinkText
		// partialValue of the link
		// driver.findElement(By.partialLinkText("Forgotten")).click();
//		Thread.sleep(5000);
//		driver.quit();

		// 8.Tag name: html tag we have to supply
		//Tags are duplicate 
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		if(header.equals("New Customer")) {
//			System.out.println("PASS");
//		}
	By header = By.tagName("h2");
	String getText = doGetElementText(header);
	System.out.println(getText);
	
	By linkText = By.linkText("Login");
	String text = doGetElementText(linkText);
	System.out.println("I am login linked text "+text);
	
		//Thread.sleep(5000);
		//driver.quit();
		
		
	}
	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
