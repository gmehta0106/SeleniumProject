package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElementsException {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		By search = By.name("search");
//		if(checkElementsDispled(search)){
//			System.out.println("Enter the value");
//		}
		
		driver.findElement(By.id("")).isDisplayed();
		if(driver.findElements(By.name("")).size()>0) {
			
		}
	}

	public static boolean checkElementsDispled(By locator) {
		List<WebElement> eleList = driver.findElements(locator);
		if (eleList.size() > 0) {
			System.out.println(locator + " Element is present on page ");
			return true;
		} else {
			return false;
		}
	}
}
