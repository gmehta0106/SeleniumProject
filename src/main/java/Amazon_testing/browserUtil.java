package Amazon_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserUtil {
	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("Launching browser: " + browserName);
		if (browserName == null) {
			System.out.println("Browser cannot be null");
			throw new MySeleniumException("BrowserNullPointerException");

		}

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "Firefox":
			driver = new FirefoxDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		case "default":
			System.out.println("Please pass the correct driver: " + browserName);

		}
		return driver;
	}

	public void launchBrowser(String url) {
		if (url == null) {
			System.out.println("Url cannot be null");
			throw new MySeleniumException("URLNullpointerException");
		}
		if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");
		}

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	public void miniWindow() {
		driver.manage().window().minimize();
	}
	public void quit() {
		driver.quit();
	}

}
