package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.google.com");
	//	boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		//System.out.println(flag);

		// By locator
		By search = By.name("q");
		Se_5ElementUtil elUtil = new Se_5ElementUtil(driver);
		if (elUtil.checkElementIsDisplayed(search)) {
			elUtil.doSendKeys(search,"Macbook");
		}else {
			System.out.println("Search is not present");
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
