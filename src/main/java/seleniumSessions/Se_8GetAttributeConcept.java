package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_8GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println("Launching browser...");
		// id attribute of firstName placeholder
//		String placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(placeholder);
//		//name attribute of firstName placeholder
//		String name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		System.out.println(name);
//		//Class attribute of firstName placeholder
//		String classatri = driver.findElement(By.id("input-firstname")).getAttribute("class");
//		System.out.println(classatri);
//		//href attribute of Login link
//		String loginUrl = driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(loginUrl);

		By fn = By.id("input-firstname");
		By loginLink = By.linkText("Login");
		String nameAtri = doGetElement(fn, "name");
		String placeHolder = doGetElement(fn, "placeholder");
		String id = doGetElement(fn,"id");
		String LinkText = doGetElement(loginLink,"href" );
		System.out.println(LinkText);
		System.out.println(placeHolder);
		if(placeHolder.equals("First Name")) {
			System.out.println("Right placeholder value---PASS");
		}else
		{
			System.out.println("wrong placeholder value---Fail");
		}
		driver.quit();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doGetElement(By locator, String value) {
		return getElement(locator).getAttribute(value);

	}
}
