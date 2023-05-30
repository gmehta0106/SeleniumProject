package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Se4_IncognitoMode {
/**
 * Incognito mode will not create any history of your web browser 
 * @param args
 */
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.ca");
		
		

	}

}
