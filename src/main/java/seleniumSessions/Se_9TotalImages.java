package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se_9TotalImages {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/table_sorting.html");
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		int totalLinks = imageList.size();
		System.out.println(totalLinks);
		
		for(WebElement e: imageList) {
			String altValue = e.getAttribute("scr");
			System.out.println(altValue);	
			
		}

	}

}
