package seleniumFrameworkPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil{
static WebDriver driver;

public ElementUtil(WebDriver driver) {
	this.driver = driver;
}

public void doSendkeys(By locator, String value) {
	getElement(locator).sendKeys(value);
}

public void doClick(By locator) {
	getElement(locator).click();
}

public WebElement getElement(By locator) {
	return driver.findElement(locator);
}
public boolean checkElementIsDisplayed(By locator){
	return getElement(locator).isDisplayed();
	}	
	}





















//private WebDriver driver;//driver should be private in utility 
//public ElementUtil(WebDriver driver){//create constructor to use Browser util driver
//	this.driver= driver;
//}
//
//public void doSendkeys(By locator, String value) {
//	getElement(locator).sendKeys(value);
//	
//}
//public  void doClick(By locator) {//utility should be non static method 
//	getElement(locator).click();}
//	
//public WebElement getElement(By locator) {
//	return driver.findElement(locator);