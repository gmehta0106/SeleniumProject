package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_8GetTextFieldValue {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement FN= driver.findElement(By.id("input-firstname"));
		FN.sendKeys("gm@gmail.com");
		String valueText=FN.getAttribute("value");
		System.out.println(valueText);
		
		WebElement LN=driver.findElement(By.id("input-lastname"));
		LN.sendKeys("MM");
		String LnValue = LN.getAttribute("value");
		System.out.println(LnValue);
//		By FN = By.id("input-firstname");
//		doSendKeys(FN,"d@gmail.com");//How to use getAttribute here
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		//character limit - then we can print like this 
		
	}
	
	
	public static void doSendKeys(By locator, String value) {
	doGetElement(locator).sendKeys(value);
	
	}
	
	public static WebElement doGetElement(By locator) {
		return driver.findElement(locator);
		
	}

}
