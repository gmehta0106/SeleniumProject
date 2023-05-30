package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_29StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.xpath("//input[@name='email']");
		Se_5ElementUtil ele = new Se_5ElementUtil(driver);
		ele.doSendKeys(emailId, "naveen@gmail.com");
		driver.navigate().refresh();
		Thread.sleep(5000);
		ele.doSendKeys(emailId, "gitanjali@gmail.com");
		Thread.sleep(5000);

		driver.quit();
		
		//never use pageFactory model it will give Stale exception 
		//never use back n forward pass url always for back n forward 

	}

}
