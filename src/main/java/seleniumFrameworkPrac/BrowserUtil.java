package seleniumFrameworkPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("Lanuching browser...");
		if(browserName ==null) {
			System.out.println("Browser cannot be null");
			throw new MySeleniumException("BrowserNullException");
		}

		switch (browserName) {
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
			System.out.println("please pass right driver: " + browserName);
			throw new MySeleniumException("WrongDriverException");
			}
		return driver;

	}
	public void launchURL(String url) {
		if(url==null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("UrlNULLException");
		}if(url.contains("http")) {
			driver.get(url);
		}else 
			System.out.println("http(s) is missing...");
			
		
		
	}
	public String getPageURL() {
		driver.getCurrentUrl();
		return driver.getCurrentUrl();
	}
	public String getPageTitle() {
		driver.getTitle();
		return driver.getTitle();
	}
	public void quitDriver() {
		driver.quit();
	}
	
	
}
