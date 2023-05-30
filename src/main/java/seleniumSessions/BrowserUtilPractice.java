package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtilPractice {

	private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("Launching the browser..."+ browserName);
		if (browserName == null) {
			System.out.println("Browser cannot be null");
			throw new MySeleniumException("BrowserNullException");
	}
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default: 
			System.out.println("Please pass the correct browsername: ..." + browserName);
			throw new MySeleniumException("WRONGBrowserException");
		}return driver;
		}

	

	public void LaunchUrl(String url) {
		if (url == null) {
			System.out.println("Url cannot be null...pls pass some value");
			throw new MySeleniumException("URLNullException");
		}

		if (url.contains("https"))
			driver.get(url);
		else {
			System.out.println("plaese pass http(s)...");
		}
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void QuitBrowser() {
		driver.quit();
	}

}
