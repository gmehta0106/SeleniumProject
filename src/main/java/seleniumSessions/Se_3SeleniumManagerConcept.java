package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class Se_3SeleniumManagerConcept {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com");

		
		//it will print chromedriver.exe path under cache memory into your system
		String cPath = SeleniumManager.getInstance().getDriverPath(co);
		System.out.println(cPath);

	}

}
