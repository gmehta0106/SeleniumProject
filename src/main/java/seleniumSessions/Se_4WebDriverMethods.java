package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Se_4WebDriverMethods {
 
	public static void main(String[] args) throws InterruptedException {
		//headless browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		//driver.get("https://classic.crmpro.com/");
//		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
//		driver.navigate().to("https://www.google.com");
//		String pgSource  = driver.getPageSource();
//		System.out.println(pgSource);
//
//		System.out.println(pgSource.contains("end customers section"));
//		
//		driver.navigate().refresh();
//		driver.get(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
		
		
	
		
		
		
		//String ps = driver.getPageSource();
		//System.out.println(ps);
		

	}

}
