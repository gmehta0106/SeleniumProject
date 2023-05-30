package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Se_25ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Selenium 4 x
		// global wait
		// not applied to specific element
		// applicable for all the web elements by default
		// cannot be used to apply on non web elements: title, url, alerts
		//the moment u write findElement by default it applies implicitly wait 10 sec when use implicitly wait
		//we never use implicitly wait in framework as it applies to all elements by default 

		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mackbook");
		String attri = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).getAttribute("aria-label");
		System.out.println(attri);
		
		Actions act = new Actions(driver);
		

	}

}
