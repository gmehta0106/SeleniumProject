package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * date 27 03 2023
 * @author gitan
 *
 */

public class Se_4HeadlessBrowser {
	/*
	 * Headless Browser - Testing is happening behind the scene 
	 * Faster
	 * Can be helpful in linux machine
	 * Can be used with CI/CD pipeline - jenkins, gitHub actions, AWS
	 * Might not work for complete app- like HTML menu items
	 * Might not work for internal navigations like mouse hover, mouse movements
	 * 
	 * 
	 */

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---headless");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
	String title = 	driver.getTitle();
		System.out.println(title);
		
		

	}

}
