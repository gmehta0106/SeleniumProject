package seleniumSessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Se_27WaitForWindow {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");

		Se_5ElementUtil ele = new Se_5ElementUtil(driver);
		ele.clickElementWhenReady(twitterLink, 5);

		if (waitForTotalWindows(2, 5)) {
			Set<String> handels = driver.getWindowHandles();
			System.out.println(handels.size());
		}

	}

	public static Boolean waitForTotalWindows(int totalWindowsToBe, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));
	}

}
