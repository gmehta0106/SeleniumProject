package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_8ElementNotPresentConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/success");
		System.out.println("Launching browser...");
	//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("address book");

		By search = By.xpath("//input[@name='search111']");
		getElement(search).sendKeys("Books");
		
		//System.out.println(search);

	}

	public static WebElement getElement(By locator) {
		WebElement element = null;//good practice that local variable initialize with there by default value, element is non primitive hence its default value is null  
		try {
		element = driver.findElement(locator);
		System.out.println("Element is found " +locator);
		}catch(NoSuchElementException e) {
			System.out.println("Element not found " +locator);
			try {
				Thread.sleep(5000);//Static waits
			} catch (InterruptedException e1) {
			
				e1.printStackTrace();
			}
			//search again after wait 
			element = driver.findElement(locator);
			e.printStackTrace();
			
		}return element;
	}
}
