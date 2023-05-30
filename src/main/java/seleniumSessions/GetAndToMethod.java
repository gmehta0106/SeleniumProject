package seleniumSessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAndToMethod {
	
	

	public static void main(String[] args) {
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.com");
		Dimension dim = new Dimension(800, 500);
		driver.manage().window().setSize(dim);
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().back();
		
		

	}

}
