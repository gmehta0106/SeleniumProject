package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
/**
 * Date: March 24, 2023
 * @author gitan
 *
 */
public class Se_3BrowserUtil {
	WebDriver driver;
/**
 * This method is initialize the driver on the bases of given browser.
 * Possible browsers are chrome, Edge, Safari, firefox
 * @param browserName
 */
		public WebDriver initDriver(String browserName) {
		System.out.println("Lanching the browser: " + browserName);
		if (browserName == null) {
			System.out.println("Browser cannot be null");
			throw new MySeleniumException("BrowserNullException");// we have created custom exception class to handle
																	// the exception with our own message
		}
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
//			driver.get("https://www.amazon.com");
//			String Title =driver.getTitle();
//			System.out.println("Title: " +Title);
			break;
		case "firefox":
			driver = new FirefoxDriver();
//				driver.get("https://www.amazon.com");
//				String Title1 = driver.getTitle();
//				System.out.println(Title1);
			break;
		case"safari":
			driver = new SafariDriver();// no need to download any exe only for mac machine 
			driver.get("https://www.amazon.com");
				String title1 = driver.getTitle();
				System.out.println(title1);
			break;
		case "edge":
			driver = new EdgeDriver();
//				driver.get("https://www.amazon.com");
//				String title =driver.getTitle();
//				System.out.println(title);
			break;
		default:
			System.out.println("Pls pass right browser name...." + browserName);
			throw new MySeleniumException("WrongBrowserException");

		}
		return driver;

	}
	/**
	 * This method is used to launch the application url. Please pass the url with http/https.
	 * @param url
	 */
	
	//Wrapper or own custom method
	public void launchURL(String url) {
		// put check here: if user pass null url and 2nd check not allowed without http
		if (url == null) {
			System.out.println("URL cannot be null");
			throw new MySeleniumException("URLNullException");// we have created custom exception class to handle the
																// exception with our own message
		}
		if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("http(s) is missing...");
		}

		
		
	}
	//Wrapper Methods 
	public String getPageTitle() {
		return driver.getTitle();
		}
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	public void quitBrowser() {
		driver.quit();
	}
	//public void closeBrowser() {
		//driver.close();
	//}
}
